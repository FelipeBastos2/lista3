import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        System.out.println("Digite seu peso:");
        double peso = inicialScanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = inicialScanner.nextDouble();

        double imc = peso / altura*2;

        if (imc < 20) {
            System.out.println("Abaixo do peso.");
            
        }

        else if (imc >=20 && imc <25) {
            System.out.println("Peso normal.");
            
        }
        else if (imc >=25 && imc <30) {
            System.out.println("Sobrepeso.");
        }
        else if (imc >=30 && imc <40) {
            System.out.println("Obeso.");
            
        }
        else if (imc >=40 ) {
            System.out.println("Obeso Mórbido!!!!!");
            
        }

        inicialScanner.close();
    }
}
