public class Calculadora {

    public Calculadora(String A,String B, String signo) {

        System.out.println("Calculadora iniciada");

        int numeroA = Integer.parseInt(A);
        int numeroB = Integer.parseInt(B);

        double resultado = 0;

        switch (signo) {
            case "+" -> resultado = numeroA+numeroB;
            case "-" -> resultado = numeroA-numeroB;
            case "/" -> resultado = (double) numeroA/numeroB;
            case "*" -> resultado = numeroA*numeroB;
            default -> System.out.println("no se reconoce la operacion");
        }
        System.out.println("Resultado: "+resultado);

    }
}

