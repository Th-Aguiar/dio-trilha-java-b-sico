package list.OperacoeBasica.ExemploCarrinho;

public class Item {
    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome, Double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }

    public Double getPreco(){
        return this.preco;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

}
