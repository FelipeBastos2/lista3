import java.util.Scanner;


public class exercicio2 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        System.out.println("Digite a 1° nota:");
        double nota1 = inicialScanner.nextDouble();

        System.out.println("Digite a 2° nota:");
        double nota2 = inicialScanner.nextDouble();

        
        System.out.println("Digite a 3° nota:");
        double nota3 = inicialScanner.nextDouble();

        double resultadoCalculo = (nota1 + nota2 + nota3);

        System.out.println("Resultado:" +resultadoCalculo /3);

        inicialScanner.close();
        
    }
}
