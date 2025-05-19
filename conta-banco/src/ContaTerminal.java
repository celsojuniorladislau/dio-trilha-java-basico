import java.util.Scanner;
import java.util.Locale;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    

       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

       //Exibir as mensagens para o nosso usuário
       //Obter pela scanner os valores digitados pelo terminal
        System.out.println("Olá, seja bem-vindo ao banco Digital da DIO!, preciso que seja digitado alguns dados para que possamos criar a sua conta.");

        System.out.println("Por favor, digite o número da conta: ");
        String numeroConta = scanner.next();

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Agora digite o nome do cliente: ");
        String cliente = scanner.next();

        System.out.println("E por fim, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

       //Exibir a mensagem conta criada
        System.out.println("Olá " + cliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        
        scanner.close();
    }
}
