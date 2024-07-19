package list.OperacoeBasica.ExemploCarrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, int quantidade){
        carrinhoDeCompras.add( new Item(nome, preco, quantidade));
    }

    public void removerItems(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        
        for(Item i : carrinhoDeCompras) {
            if(i.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(i);
            }
        }

        carrinhoDeCompras.removeAll(itemsParaRemover);
    }

    public void calcularValorTotal(){
        Double valorRetornar = 0.0;

        for(Item i : carrinhoDeCompras){
            valorRetornar += (i.getQuantidade() * i.getPreco());
        }

        System.out.print("Valor total do carrinho " + valorRetornar);
    }

    public void exibirItems(){
        System.out.println(carrinhoDeCompras);
    }
}
