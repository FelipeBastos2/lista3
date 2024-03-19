import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args) {
        Scanner inicialScanner = new Scanner(System.in);

        System.out.println("Eleitores total:");
        int eleitoresTotal = inicialScanner.nextInt();

        System.out.println("Votos brancos:");
        int votosBra = inicialScanner.nextInt();

        System.out.println("Votos nulos:");
        int votosNul = inicialScanner.nextInt();

        System.out.println("Votos válidos:");
        int votosVal =inicialScanner.nextInt();

        int valorTotal = votosBra+ votosNul + votosVal;
        System.out.println("Eleitores:" +eleitoresTotal);
        System.out.println("Porcentagem de votos brancos:"  +votosBra * 100/ valorTotal+"%");
        System.out.println("Porcentagem de votos brancos:"  +votosNul * 100/ valorTotal+"%");
        System.out.println("Porcentagem de votos brancos:"  +votosVal * 100/ valorTotal+"%");

        inicialScanner.close();

    }
    
}
