import java.util.Scanner;

public class Unid4Exe09 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int valor1 = teclado.nextInt();

        System.out.println("Digite o segundo valor: ");
        int valor2 = teclado.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("São múltiplos");
        }else {
            System.out.println("Não são múltiplos");
        }

        teclado.close();
    }
}
