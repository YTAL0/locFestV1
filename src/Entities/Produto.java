package Entities;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nome;
    private double valor;
    private int quantidade;

    public Produto(int quantidade, double valor, String nome) {
        this.quantidade = quantidade;
        this.valor = valor;
        this.nome = nome;
    }
}
