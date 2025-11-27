package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("=== Observer Pattern: Grupo de Família WhatsApp ===\n");

        // Criar o publicador (grupo da família)
        var grupoFamilia = new Publisher();
        System.out.println("✓ Grupo criado: 'Família'\n");

        // Criar os assinantes (membros da família)
        var zezinho = new ConcreteSubscriber("Zezinho");
        var huguinho = new ConcreteSubscriber("Huguinho");
        var tia = new ConcreteSubscriber("Tia Maria");
        
        System.out.println("✓ Membros criados: Zezinho, Huguinho, Tia Maria\n");

        // Adicionar membros ao grupo
        System.out.println(">>> Adicionando membros ao grupo...");
        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huguinho);
        grupoFamilia.subscribe(tia);
        System.out.println("✓ Total de membros: " + grupoFamilia.getSubscriberCount() + "\n");

        // Primeira mensagem
        System.out.println(">>> Mãe enviando mensagem...");
        grupoFamilia.setMainState("BOM DIAAA ❤️❤️❤️");
        grupoFamilia.notifySubscribers();
        System.out.println();

        // Segunda mensagem
        System.out.println(">>> Mãe enviando segunda mensagem...");
        grupoFamilia.setMainState("Quem quer café? ☕");
        grupoFamilia.notifySubscribers();
        System.out.println();

        // Remover um assinante
        System.out.println(">>> Huguinho saindo do grupo...");
        grupoFamilia.unsubscribe(huguinho);
        System.out.println("✓ Total de membros: " + grupoFamilia.getSubscriberCount() + "\n");

        // Mensagem depois que um saiu
        System.out.println(">>> Mãe enviando terceira mensagem...");
        grupoFamilia.setMainState("Almoço pronto! Venham comer! 🍽️");
        grupoFamilia.notifySubscribers();
    }
}
