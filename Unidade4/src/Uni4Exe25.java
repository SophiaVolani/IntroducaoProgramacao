import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        float valor1, valor2;
        float soma, subtracao, multiplicacao, divisao;
        int opcao;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor 1:");
        valor1 = teclado.nextFloat();

        System.out.println("Digite o valor 2:");
        valor2 = teclado.nextFloat();

        System.out.println("Escolha uma opção:");
        System.out.println("1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");

        opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                soma = valor1 + valor2;
                System.out.println(soma);
                break;
            case 2:
                subtracao = valor1 - valor2;
                System.out.println(subtracao);
                break;
            case 3:
                multiplicacao = valor1 * valor2;
                System.out.println(multiplicacao);
                break;
            case 4:
                if (valor2 != 0) {
                    divisao = valor1 / valor2;
                    System.out.println(divisao);
                } else {
                    System.err.println("Erro! O denominador não pode ser zero.");
                }
                break;
            default:
                System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}