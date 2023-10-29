import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args){
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Agencia!");
        agencia = sc.next();
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Agora, digite o seu depósito: ");
        saldo = sc.nextDouble();

        System.out.println("Olá %s , obrigado por criar uma conta em nosso banco, sua agência %s , conta %d e seu saldo %.2f já está disponível para saque" + nomeCliente + agencia + numero + saldo);

    }
}
