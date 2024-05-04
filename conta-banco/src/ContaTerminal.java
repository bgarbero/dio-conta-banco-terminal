import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da agência!");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o seu Saldo!");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

        scanner.close();
    }
}
