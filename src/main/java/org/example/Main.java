package org.example;

public class Main {
    public static void main(String[] args) {
        Handler gerenteJunior = new GerenteJunior();
        Handler gerenteSenior = new GerenteSenior();
        Handler diretor = new Diretor();

        gerenteJunior.definirProximo(gerenteSenior);
        gerenteSenior.definirProximo(diretor);

        System.out.println(gerenteJunior.handle(500));
        System.out.println(gerenteJunior.handle(2000));
        System.out.println(gerenteJunior.handle(10000));
    }
}