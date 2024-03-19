import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner iniciScanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = iniciScanner.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = iniciScanner.nextDouble();

        System.out.println("Digite o terceiro valor:");
        double valor3 = iniciScanner.nextDouble();

        if (valor3 + valor2 < valor1 ||valor2 + valor1 < valor3||valor1 + valor3 < valor2 ) {
            System.out.println("Não aceitavél!");
            return;
        }

      
        else System.out.println("É um triângulo.");





        if (valor1 == valor2 && valor3 == valor1 && valor2 == valor3) {
            System.out.println("Seu triângulo é equilátero.");

        }

        else if (valor1 != valor2 && valor3 != valor1 && valor2 != valor3) {
            System.out.println("Seu triângulo é escaleno.");
        }


        else System.out.println("Seu triangulo é isósceles");

        iniciScanner.close();
    }
}
