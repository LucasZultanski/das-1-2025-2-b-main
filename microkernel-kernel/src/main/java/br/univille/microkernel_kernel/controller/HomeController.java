package br.univille.microkernel_kernel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microkernel_kernel.service.DefaultService;

import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    
    @Autowired
    private Map<String, DefaultService> services;

    @GetMapping
    public ResponseEntity<String> index() {
        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("🏗️  MICROKERNEL - Descoberta e Execução de Plugins");
        System.out.println("═══════════════════════════════════════════════════════\n");

        if (services.isEmpty()) {
            System.out.println("⚠️  Nenhum plugin registrado!");
            return ResponseEntity.ok("Nenhum plugin disponível");
        }

        System.out.println("✓ Plugins descobertos: " + services.size());
        System.out.println();

        for (Map.Entry<String, DefaultService> entry : services.entrySet()) {
            String pluginName = entry.getKey();
            DefaultService plugin = entry.getValue();
            
            System.out.println("─────────────────────────────────────────────────────");
            System.out.println("Executando plugin: " + pluginName);
            System.out.println("─────────────────────────────────────────────────────");
            
            try {
                var result = plugin.doWork(null);
                System.out.println("  Status: " + result);
            } catch (Exception e) {
                System.out.println("  ✗ Erro na execução: " + e.getMessage());
            }
            
            System.out.println();
        }

        System.out.println("═══════════════════════════════════════════════════════");
        System.out.println("✓ Execução concluída!");
        System.out.println("═══════════════════════════════════════════════════════\n");

        return ResponseEntity.ok("Plugins executados com sucesso!");
    }

    @GetMapping("/plugins")
    public ResponseEntity<String> listPlugins() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plugins registrados:\n");
        
        services.forEach((name, service) -> 
            sb.append("  • ").append(name).append(" (").append(service.getClass().getSimpleName()).append(")\n")
        );
        
        return ResponseEntity.ok(sb.toString());
    }
}