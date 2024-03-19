import java.util.Random;    
import java.util.Scanner;


public class Exercicio6 {
    public static void main(String[] args) {
        Scanner aleaNum = new Scanner(System.in);
        Random aleatorio = new Random();
       
        System.out.println("Numero 1:");
        int num1 = aleaNum.nextInt();

        System.out.println("Numero 2:");
        int num2 = aleaNum.nextInt();


        int maiorNum = Math.max(num1, num2);
        int menorNum = Math.min(num1, num2);
        int gerador = aleatorio.nextInt(menorNum, maiorNum);
       

        System.out.println("Numero sorteado:"+gerador);
      
        aleaNum.close();
    }
    
}
