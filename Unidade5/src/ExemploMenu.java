import java.util.Scanner;

public class ExemploMenu {
    private static double valor1;
    private static double valor2;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        do{
        System.out.println("Menu");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicar");
        System.out.println("9 - Sair");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                informarValores(teclado);
                somar(valor1, valor2);
                break;
            
            case 2:
                informarValores(teclado);
                subtrair(valor1, valor2);
                break;
            case 3:
                informarValores(teclado);
                dividir(valor1, valor2);
                break;
            case 4:
                informarValores(teclado);
                multiplicar(valor1, valor2);
                break;
            default:
                break;
        }
    }while(opcao != 9);
    teclado.close();
    }
    private static void informarValores(Scanner teclado){
        System.out.println("Digite o primeiro valor: ");
        valor1 = teclado.nextDouble();

        System.out.println("Digite o segundo valor: ");
        valor2 = teclado.nextDouble();
    }
    private static void multiplicar(double valor1, double valor2) {
        System.out.println("Opção escolhida: Multiplicação");
        System.out.println("Resultado: "+ (valor1 * valor2));
    }

    private static void dividir(double valor1, double valor2) {
        System.out.println("Opção escolhida: Divisão");
        System.out.println("Resultado: "+ (valor1 / valor2));

    }

    private static void subtrair(double valor1, double valor2) {
        System.out.println("Opção escolhida: Subtração");
        System.out.println("Resultado: "+ (valor1 - valor2));

    }

    private static void somar(double valor1, double valor2) {
        System.out.println("Opção escolhida: Soma");
        System.out.println("Resultado: "+ (valor1 + valor2));

    }
}
