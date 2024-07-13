package list.OperacoeBasica;

import java.util.ArrayList;
import java.util.List;


public class ListaTarefas {
    //Atributo
     private List<Tarefa> tarefaList;

     public ListaTarefas(){
          this.tarefaList = new ArrayList<>();
     }

     public void adicionarTarefa(String descricao){
          tarefaList.add( new Tarefa(descricao));
     }

}
