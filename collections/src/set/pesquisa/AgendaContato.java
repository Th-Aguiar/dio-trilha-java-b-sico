package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numertoTelefone){
        contatoSet.add( new Contato(nome, numertoTelefone));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public void pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();

       for(Contato c : contatoSet){
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }

        System.out.println(contatoPorNome);
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        //Foreach para verificar se o nome é igual ao solicitado
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                //Atualiza no objeto
                c.setNumeroTelefone(novoNumero);
                //atualiza o array
                contatoAtualizado = c;
                break;
            }
        }

        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato ac = new AgendaContato();
        
        ac.adicionarContato("Thiago", 969370570);
        ac.adicionarContato("Carol", 969370570);
        ac.adicionarContato("Carol Enfermeira", 969370570);
        ac.pesquisarPorNome("Carol");
        

    }
    
}
