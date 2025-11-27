package br.univille.observer;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Grupo criado.");

        var grupoFamilia = new Publisher();

        var zezinho = new ConcreteSubscriber("CLIETO");
        var huguinho = new ConcreteSubscriber("joão");
        var tia = new ConcreteSubscriber("pedrin");

        System.out.println("Membros: CLIETO, joão, pedrin");

        grupoFamilia.subscribe(zezinho);
        grupoFamilia.subscribe(huguinho);
        grupoFamilia.subscribe(tia);
        System.out.println("Total de membros: " + grupoFamilia.getSubscriberCount());

        System.out.println("Mãe: oi");
        grupoFamilia.setMainState("oi");
        grupoFamilia.notifySubscribers();
        System.out.println();

        System.out.println("Mãe: almoço 13h");
        grupoFamilia.setMainState("almoço 13h");
        grupoFamilia.notifySubscribers();
        System.out.println();

        System.out.println("joão saiu.");
        grupoFamilia.unsubscribe(huguinho);
        System.out.println("Total de membros: " + grupoFamilia.getSubscriberCount());

        System.out.println("Mãe: almoço pronto");
        grupoFamilia.setMainState("almoço pronto");
        grupoFamilia.notifySubscribers();
    }
}
