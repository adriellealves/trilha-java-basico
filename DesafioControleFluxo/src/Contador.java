import java.util.Scanner;


public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
        if (parametroUm>parametroDois) {
            ParametrosInvalidosException.parametrosInvalidos();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i<=contagem; i++){
                System.out.println("imprimindo o numero "+ i);
        }
        }

		
	}
}
