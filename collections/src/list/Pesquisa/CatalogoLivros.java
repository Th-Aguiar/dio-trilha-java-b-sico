package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogoLivros;

    public void catalogoLivros(){
        this.catalogoLivros = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        catalogoLivros.add( new Livro(titulo, autor, anoPublicacao));
    }
  
    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();
        
        if(catalogoLivros.isEmpty()){
            System.out.println("Lista de Livros vazia.");
        } else {

            //ForEach para verificar se o autor é igual
            for(Livro l : catalogoLivros){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;

        //Verifica se o Array esta vazio, caso nao esteja o "isEmpedy" retorna false e precisa que ele se converta para "true"
        if(!catalogoLivros.isEmpty()){

            //ForEach para verificar se o titulo é igual
            for(Livro l : catalogoLivros){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    //atribui o valor na variavel
                    livroPorTitulo = l;

                    //O break ira acabar com o laço
                    break;
                }
            }
        }

        //Retorna o valor do titulo
        return livroPorTitulo;
    }

}

