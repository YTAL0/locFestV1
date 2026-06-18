package Entities;

import Enums.Role;

public class Produto {
    private String name;
    private double valor;
    private int quantidade;
    private  Locacao locacao;

    public Produto(int quantidade, double valor, String name) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.name = name;
    }
}
