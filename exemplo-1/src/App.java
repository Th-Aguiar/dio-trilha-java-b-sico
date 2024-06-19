import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class App {
    public static void main(String[] args) throws Exception {
        ServicoMensagemInstantanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if (appEscolhido.equals("fbm")){
            smi = new FacebookMessenger();
        }else if (appEscolhido.equals("Telegram")){
            smi = new Telegram();
        };

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
