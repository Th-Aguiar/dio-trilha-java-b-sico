package list.OperacoeBasica.ExemploLista;

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

     //Iremos fazer com mais constancia
     public void removerTarefa(String descricao){
          List<Tarefa> tarefasParaRemover = new ArrayList<>();

          for(Tarefa t : tarefaList){
               if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaRemover.add(t);
               }
          }

          //Remove todas as palavras achadas no array
          tarefaList.removeAll(tarefasParaRemover);
     }

     public int obterNumeroTotalTarefas(){
          return tarefaList.size();
     }

     public void obterDescricoesTarefas(){
          System.out.print(tarefaList);
     }

     //Teste Exec
     public static void main(String[] args) {
          ListaTarefas listaTarefas = new ListaTarefas();

          listaTarefas.adicionarTarefa("Estudar");

          System.out.println("O numero total de tarefas na lista é " + listaTarefas.obterNumeroTotalTarefas());

          listaTarefas.obterDescricoesTarefas();
          
     }
}
