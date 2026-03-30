import java.util.Scanner;
public class Uni2Exe02 {
    public static void main(String[] args) {
        int valor1 = 0;
        int valor2 = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        valor1 = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        valor2 = teclado.nextInt();

        System.out.println("Multiplicação dos valores: " + (valor1 * valor2));
        teclado.close();
    }
}
