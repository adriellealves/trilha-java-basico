import java.util.Scanner;

public class ContaTerminal {

    
    public static void main(String[] args) throws Exception {
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
        

    }
}
