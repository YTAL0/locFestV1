package Entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Locacao {
    private Usuario locador;
    private Usuario locatario;
    private LocalDate dataInicioLocao;
    private LocalDate dataFimLocao;
    private List<Produto> produtos = new ArrayList<>();
    private int ID = 0;

    public Locacao() {
    }

    public Locacao(Usuario locador, Usuario locatario, LocalDate dataInicioLocao, LocalDate dataFimLocao, List<Produto> produtos) {
        this.locador = locador;
        this.locatario = locatario;
        this.dataInicioLocao = dataInicioLocao;
        this.dataFimLocao = dataFimLocao;
        this.produtos = produtos;
        this.ID++;
    }

    @Override
    public String toString() {
        return "Locacao{" +
                "locador=" + locador +
                ", locatario=" + locatario +
                ", dataInicioLocao=" + dataInicioLocao +
                ", dataFimLocao=" + dataFimLocao +
                ", produtos=" + produtos +
                ", ID=" + ID +
                '}';
    }
}
