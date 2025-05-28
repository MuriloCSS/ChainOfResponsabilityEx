package org.example;

public class GerenteJunior extends BaseHandler{
    @Override
    public String handle(double valor) {
        if (valor <= 1000) {
            return "Aprovado pelo Gerente Júnior.";
        }
        if (proximo != null) {
            return proximo.handle(valor);
        }
        return "Requisição não pode ser processada.";
    }
}
