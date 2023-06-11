package org.example;

public class Estoque {
    private int quantidade1;
    private int quantidade2;

    public Estoque(int quantidade1, int quantidade2) {
        this.quantidade1 = quantidade1;
        this.quantidade2 = quantidade2;
    }

    public int calcular(Operacao operacao) {
        return operacao.calcular(quantidade1, quantidade2);
    }
}
