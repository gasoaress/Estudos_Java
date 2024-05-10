import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) throws Exception {
        int numeroDaConta;
        String agencia, nomeDoCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja Bem Vindo ao Banco Java!");
        System.out.println("Para criar uma Conta, insira os valores.");
        System.out.println("-------------------------------\n");

        System.out.println("Por favor digite o Número da Conta.");
        numeroDaConta = scanner.nextInt();

        System.out.println("\nPor favor digite a Agência.");
        agencia = scanner.next();
        
        System.out.println("\nPor favor digite seu nome.");
        nomeDoCliente = scanner.next();

        System.out.println("\nPor favor digite o Saldo.");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta no Banco Java, sua Agencia é -> " + agencia + ", conta -> " + 
            numeroDaConta + ", você tem um saldo de -> " + saldo + " disponível para saque.");
    }
}