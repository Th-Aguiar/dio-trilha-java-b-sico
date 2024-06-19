package apps;
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();


    //Validacao de conexao - somente filhos conhecem este metodo
    protected void validarConexao(){
        System.out.println("Validando conexao com a internet");
    }
}
