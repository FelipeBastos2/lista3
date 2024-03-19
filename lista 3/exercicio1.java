import java.util.Scanner;
public class exercicio1 {

    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero:");
        int num1 = inicialScanner.nextInt() ;

        System.out.println("Digite o segundo numero");
        int num2 = inicialScanner.nextInt() ;

        int divisao = num1 / num2;
        System.out.println("Resultado:" +divisao);




    
        inicialScanner.close();



    }
}