package org.example;

public abstract class BaseHandler implements Handler {
    protected Handler proximo;

    @Override
    public void definirProximo(Handler proximo) {
        this.proximo = proximo;
    }

    @Override
    public abstract String handle(double valor);

}
