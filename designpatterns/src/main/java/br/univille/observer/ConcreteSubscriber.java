package br.univille.observer;

public class ConcreteSubscriber
    implements Subscriber {

    private String nome;

    public ConcreteSubscriber(String nome) {
        this.nome = nome;
    }

    @Override
    public void update(String context) {
        System.out.println(nome + " recebeu: " + context);
    }
}
