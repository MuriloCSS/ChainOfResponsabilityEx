package org.example;

public interface Handler {
    void definirProximo(Handler proximo);
    String handle(double valor);
}
