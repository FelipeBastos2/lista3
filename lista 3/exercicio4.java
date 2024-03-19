import java.util.Scanner;
//*Adicionar o Main */
public class  exercicio4 {
    void calculoSalario() {//*Mude para Static */
        double salario;
        Scanner entrada = new Scanner(System.in);
        double taxaAumento1 = 1.1;
        double taxaAumento2 = 1.2;
        double taxaAumento3 = 1.3;

        System.out.println(); //*Nao necessário o código pois está vazio. */
        System.out.print("Por favor, informe o valor do salário atual: ");
        salario = entrada.nextDouble();

        if(salario <= 1000) {
            salario *= taxaAumento3;
        }

        if(salario <= 2000) {//*Necessário mudar para else if */
            salario *= taxaAumento2;
        }

        if(salario <= 3000) {//*Necessário mudar para else if */
            salario *= taxaAumento1;
        }

        if (salario <= 4000) {//*Necessário mudar para else */
            salario = (salario * taxaAumento1) + 200;
        }

        System.out.println(); //*Nao necessário o código pois está vazio. */
        System.out.printf("Novo Salário: R$ %.2f\n\n", salario);

        //*Necessário usar o comando .close(); */
        
    }
}