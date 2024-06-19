package apps;
public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConexao();
        System.out.println("MSN envia desse jeito");
        
    }

    @Override
    public void receberMensagem() {
        System.out.println("MSN Recebe assim");        
    }



   
}