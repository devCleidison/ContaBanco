import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta");
        int numeroConta = scanner.nextInt();

        scanner.nextLine(); // Clean keyboard buffer
        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo");
        double saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(nomeCliente)
                + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia)
                + ", conta ".concat(String.valueOf(numeroConta)) + " e seu saldo R$ ".concat(String.valueOf(saldo))
                + " já está disponível para saque.";

        scanner.close();

        System.out.println();
        System.out.println(mensagem);
    }
}
