import java.util.Scanner;

public class exercicio9 {

    public static void main(String[] args) {
        Scanner iniScanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = iniScanner.nextInt();
            if (idade < 16) {
                System.out.println("Não é eleitor!");
            }

            else if (idade == 16 && idade <17) {
                System.out.println("Eleitor facultativo!");
            }
            else if (idade >= 18 && idade <65) {
                System.out.println("Eleitor obrigatório!");
            }
            else if (idade > 65) {
                System.out.println("Eleitor facultativo!");
            }
    


        iniScanner.close();

    }

    
}
