import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

    
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();                    

        System.out.print("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        scanner.close();

       
        String mensagem = String.format(
            "Olá %s, obrigado por criar uma conta em nosso banco, " +
            "sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
            nomeCliente, agencia, numero, saldo
        );

        System.out.println();
        System.out.println(mensagem);
    }
}
