public class ServicoMensagemInstantanea {
    public void enviarMensagem() {
        //Validacao de conexao
        validarConectadoInternet();
        //Enviar mensagem
        System.out.println("Enviando mensagem Facebook");

        //Depois de enviada salvar o historico
        salvarHistoricoMensagem();
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem Facebook");
    }

    //Metodos privates
    private void validarConectadoInternet(){
        System.out.println("Validando conexao com a internet");
    }

    private void salvarHistoricoMensagem(){
        System.out.println("Guardando Mensagem");
    }
}
