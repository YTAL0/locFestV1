package Entities;
import Enums.Role;

import java.time.LocalDate;
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
    public void addProduto(Produto produtos){
        this.produtos.add(produtos);
    }
    public Locacao criarLocacao(Usuario locador, List<Produto> produtos, LocalDate dataInicio, LocalDate dataFim){
        if(this.role != Role.LOCATARIO){
            try {
                throw new IllegalAccessException("So locatario podem acessar essa funcao");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
        return new Locacao(locador, this, dataInicio, dataFim, produtos);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", role=" + role +
                ", numeroCell='" + numeroCell + '\'' +
                ", cpf='" + cpf + '\'' +
                ", produtos=" + produtos +
                ", email='" + email + '\'' +
                '}';
    }
}
