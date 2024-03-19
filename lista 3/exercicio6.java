import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 4:");
        int num = inicialScanner.nextInt(4);
            if (num == 1) {
                System.out.println("Primavéra");
            }    
            else if (num == 2) {
                System.out.println("Verão");
            }    
            else if (num == 3) {
                System.out.println("Outono");
            }  
            else if (num == 4) {

                System.out.println("Inverno");
            }    
    

        inicialScanner.close();
    }
}
