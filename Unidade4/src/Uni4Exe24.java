import java.util.Scanner;

public class Uni4Exe24{
    public static void main(String[] args) {
        int valor1, valor2, valor3, opcao;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Determine a ordem de acordo com a opção: ");
        System.out.println("se opção = 1, escreva os 3 valores em ordem crescente.");
        System.out.println("se opção = 2, escreva os 3 valores em ordem decrescente.");
        System.out.println("se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio.");

        System.out.println("Digite o valor 1: ");
        valor1 = teclado.nextInt();

        System.out.println("Digite o valor 2: ");
        valor2 = teclado.nextInt();

        System.out.println("Digite o valor 3: ");
        valor3 = teclado.nextInt();

        System.out.println("Digite o número da opção: ");
        opcao = teclado.nextInt();

        int maior = Math.max(valor1, Math.max(valor2, valor3));
        int menor = Math.min(valor1, Math.min(valor2, valor3));
        int meio = (valor1 + valor2 + valor3) - maior - menor;

        switch (opcao){
            case 1:
                System.out.println(menor + " " + meio + " " + maior);
                break;
            case 2:
                System.out.println(maior + " " + meio + " " + menor);
                break;
            case 3:
                System.out.println(menor + " " + maior + " " + meio);
                break;
            default:
                System.out.println("Opção inválida.");
        }
        teclado.close();
    }
}