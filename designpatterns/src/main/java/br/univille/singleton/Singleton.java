package br.univille.singleton;

/**
 * Singleton Pattern
 * Garante que uma classe tenha apenas UMA única instância
 * em toda a aplicação
 * 
 * Analogia: Ender Chest do Minecraft
 * - Não importa em qual lugar você está no mundo
 * - Sempre acessa o MESMO baú
 * - Os itens guardados estão sempre lá
 */
public class Singleton {
    // 1. Instância estática privada - como um "recipiente" global
    private static Singleton instance;
    
    // 2. Dado compartilhado entre todas as chamadas
    private String segredo;

    /**
     * 3. Construtor PRIVADO
     * Impede a criação de instâncias via "new Singleton()"
     * Apenas a classe pode instanciar a si mesma
     */
    private Singleton() {
        System.out.println("  Singleton: Construtor privado chamado");
    }

    /**
     * 4. Método estático público - ÚNICA forma de obter a instância
     * 
     * Primeira chamada: cria a instância
     * Chamadas subsequentes: retorna a instância já criada
     */
    public static Singleton getInstance() {
        System.out.println("  Singleton: getInstance() chamado");
        
        // Verificar se a instância já existe
        if (instance == null) {
            System.out.println("  Singleton: Instância não existe, criando nova...");
            instance = new Singleton();
        }
        
        return instance;
    }

    /**
     * Getter e Setter para o segredo
     */
    public String getSegredo() {
        return segredo;
    }

    public void setSegredo(String segredo) {
        this.segredo = segredo;
    }

    /**
     * Variante Thread-Safe (sincronizado)
     * Use isto se a aplicação for multi-threaded
     */
    public static Singleton getInstanceThreadSafe() {
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }

    /**
     * Variante Lazy Initialization Holder (Double-Checked Locking)
     * Mais eficiente em ambientes multi-threaded
     */
    private static class SingletonHolder {
        static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstanceLazy() {
        return SingletonHolder.INSTANCE;
    }
}
