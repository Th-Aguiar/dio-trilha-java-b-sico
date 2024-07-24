package set.OperacoeBasica;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    public Set<Convidado> convidadoSet;
    
    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){

        //cria um novo objeto dentro da variavel convidadoSet
        convidadoSet.add( new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        //foreach para verificar cada array
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoSet.remove(c);
                break;
            }
        }
    }

    public int contarConvidados(){
        return this.convidadoSet.size();
    }

    public void exibirConvidados(){
         System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjunto = new ConjuntoConvidados();
        System.out.println("Existem " + conjunto.contarConvidados() + " Dentro do Set de convidados");
        
        conjunto.adicionarConvidado("Thiago", 1);
        conjunto.adicionarConvidado("Carol", 2);
        conjunto.adicionarConvidado("Algustos", 3);

        conjunto.exibirConvidados();
        conjunto.removerConvidadoPorCodigoConvite(3);

        conjunto.exibirConvidados();
    }

}
