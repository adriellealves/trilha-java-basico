import java.util.Scanner;

public class ContaTerminal {

    private static int numero;
    private static String agencia;
    private String nomeCliente;
    private double saldo;

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o número da Conta!");
        agencia = sc.nextLine();
        System.out.println("Hello, World!");
    }
}
