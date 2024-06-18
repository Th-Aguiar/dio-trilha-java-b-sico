public class App {
    public static void main(String[] args) throws Exception {
        FacebookMessenger fb = new FacebookMessenger();
        fb.enviarMensagem();

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();

        Telegram telegram = new Telegram();
        telegram.enviarMensagem();
    }
}
