import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner iniScanner = new Scanner(System.in);

        System.out.println("Digite seu produto:");
        String produto = iniScanner.nextLine();

        System.out.println("Digite a quantidade:");
        int quantidade = iniScanner.nextInt();

        System.out.println("Digite o valor:");
        double valor = iniScanner.nextDouble();

        if (quantidade < 5) {
            System.out.println("Desconto de 2%");
        }

        else if (quantidade >5 && quantidade<10) {
            System.out.println("Desconto de 3%");
        }


        else if (quantidade >10 && quantidade<30) {
            System.out.println("Desconto de 5%");
        }


        else if (quantidade >=30) {
            System.out.println("Desconto de 10%");
        }


        iniScanner.close();
    }
}
