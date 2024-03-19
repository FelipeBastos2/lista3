import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args) {
        Scanner iniScanner = new Scanner(System.in);

        System.out.println("    Menu\n\nEntrar(1) ou Sair(2)?");
        int back = iniScanner.nextInt();
        
      switch (back) {
        case 2:
             System.out.println("Saindo...");
             return;
        case 1:
        System.out.println("Entrando...");
        default:
            break;
      }
      
      System.out.println("1. Exibir saldo");
      System.out.println("2. Exibir extrato");
      System.out.println("3. Realizar depósito");
      System.out.println("4. Realizar saque");
      System.out.println("5. Sair");
      int op = iniScanner.nextInt();
      switch (op) {
        case 1:
            System.out.println("Exibindo saldo...");
            break;
      
            case 2:
            System.out.println("Exibindo extratpo...");
            break;
      
            case 3:
            System.out.println("Realizando depósito...");
            break;
      
            case 4:
            System.out.println("Realizando saque...");
            break;
      
            case 5:
            System.out.println("Saindo...");
            break;
      
        default: 
        System.out.println("Erro! Realize sua solicitação novamente.");
            break;
      }

      iniScanner.close();
    }
}
