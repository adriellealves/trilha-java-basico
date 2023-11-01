public class ParametrosInvalidosException extends Exception {
    public static final String PRIMEIRO_PARAMETRO_MAIOR_QUE_O_SEGUNDO = "O segundo parâmetro deve ser maior que o primeiro";

    public static void parametrosInvalidos(){
       System.out.println(PRIMEIRO_PARAMETRO_MAIOR_QUE_O_SEGUNDO);
    }

}

   
