package apps;
public class Telegram extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        //Validando conexao com a internet.
        validarConexao();
        System.out.println("Telegram envia desse jeito");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Telegram Recebe assim");        
    }

    
}
