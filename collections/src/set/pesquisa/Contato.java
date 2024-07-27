package set.pesquisa;

public class Contato {
    private String nome;
    private int numertoTelefone;

    public Contato(String nome, int numertoTelefone){
        this.nome = nome;
        this.numertoTelefone = numertoTelefone;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumeroTelefone(){
        return this.numertoTelefone;
    }

    public void setNumeroTelefone(int numertoTelefone){
        this.numertoTelefone = numertoTelefone;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contato other = (Contato) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "{nome=" + nome + ", numertoTelefone=" + numertoTelefone + "}";
    }

    
    
}
