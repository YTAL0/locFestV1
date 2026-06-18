import Entities.Locacao;
import Entities.Produto;
import Entities.Usuario;

import static Enums.Role.LOCATARIO;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Usuario user1 = new Usuario("Joao", 19, LOCATARIO, "12345", "joao@email.com", "899768342", "020.482.710-02");
    Usuario user2 = new Usuario("Jp", 19, LOCATARIO, "11111", "jp@email.com", "89911111", "000.002.000-00");
    Produto prod1 = new Produto(5, 10.2, "Cadeiras");
    Produto prod2 = new Produto(8, 4.34, "Pratos Simples");
    user1.addProduto(prod1);
    user1.addProduto(prod2);

    IO.println(user1.toString());
    Locacao loc = user1.criarLocacao(user2, user1.getProdutos(), LocalDate.now(), LocalDate.now());

    IO.println(loc.toString());
}
