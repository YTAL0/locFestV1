package Entities;
import Enums.Role;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private int idade;
    private Role role;
    private String senha;
    private String email;
    private String numeroCell;
    private String cpf;
    private List<Produto> produtos = new ArrayList<>();

    public Usuario(String nome, int idade, Role role, String senha, String email, String numeroCell, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.role = role;
        this.senha = senha;
        this.email = email;
        this.numeroCell = numeroCell;
        this.cpf = cpf;
    }
}
