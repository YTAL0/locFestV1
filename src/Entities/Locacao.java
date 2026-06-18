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
}
