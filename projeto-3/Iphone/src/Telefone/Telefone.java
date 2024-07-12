package Telefone;

import Navegador.Navegador;
import ReprodutorMusical.ReprodutorMusical;

public class Telefone implements Navegador, ReprodutorMusical {
    public void exibirPagina(){
        System.out.println("Exibir");
    }
    public void tocar(){
        System.out.println("Tocar");
    };
    public void pausar(){
        System.out.println("Pausar Musica");
    };
    public void selecionarMusica(){
        System.out.println("Selecionar Musica");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrir Aba");        
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar Pagina");        
    };
}
