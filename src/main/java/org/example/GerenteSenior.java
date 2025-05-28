package org.example;

public class GerenteSenior extends BaseHandler{
    public String handle(double valor) {
        if (valor <= 5000) {
            return "Aprovado pelo Gerente Sênior.";
        }
        if (proximo != null) {
            return proximo.handle(valor);
        }
        return "Requisição não pode ser processada.";
    }
}
