import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Informe seu nome");
        String nomeUsuario = scanner.next();
        
        System.out.println("Por favor, digite o número da conta;");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência");
        int agencia = scanner.nextInt();

        System.out.println("Digite o saldo da sua conta");
        Double saldo = scanner.nextDouble();

        System.out.println("Ola " + nomeUsuario + " Obrigado por criar conta em nosso banco, sua agencia é " + agencia + " Conta " + numeroConta + " e seu saldo é " + saldo + "e ThJa esta disponivel para saque.");

    }
}
