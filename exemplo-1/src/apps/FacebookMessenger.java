package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("Facebook envia desse jeito");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("Facebook Recebe assim");        
    }


   
}
