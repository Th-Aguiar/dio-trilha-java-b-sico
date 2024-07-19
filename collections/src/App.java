
import list.OperacoeBasica.ExemploCarrinho.CarrinhoDeCompras;



public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Hobbit", 30.0, 2);

        carrinho.exibirItems();
        //carrinho.removerItems("Hobbit");
        carrinho.adicionarItem("Senhor dos Aneis", 90.0, 1);
        carrinho.adicionarItem("Pentecostal Reformado", 20.0, 2);
        carrinho.exibirItems();
        carrinho.calcularValorTotal();
    }
}
