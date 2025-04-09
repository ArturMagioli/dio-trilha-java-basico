import java.util.Locale;
import java.util.Scanner;
import entities.Cliente;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Obtendo os dados do cliente:
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.print("Informe o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite a sua agência: ");
        String agencia = scanner.next();

        System.out.print("Agora o número da agência: ");
        int numeroAgencia = scanner.nextInt();

        System.out.print("Por fim, informe o seu saldo inicial: ");
        double saldo = scanner.nextDouble();
        scanner.close();

        //instanciando o cliente
        Cliente cliente = new Cliente(nome, agencia, numeroAgencia, saldo);
        System.out.println(cliente.feedbackCliente());
    }
}
