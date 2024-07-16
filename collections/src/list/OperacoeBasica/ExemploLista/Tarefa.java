package list.OperacoeBasica.ExemploLista;

public class Tarefa {
    //Atributo
    private String descricao;
    
    //Constructor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }

    @Override
    public String toString() {   
        return descricao;
    }

}
