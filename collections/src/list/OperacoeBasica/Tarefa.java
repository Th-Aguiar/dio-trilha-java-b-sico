package list.OperacoeBasica;

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

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

}
