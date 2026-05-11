import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int n;
        int numero = 1;

        System.out.print("Digite um número positivo 'n': ");
        n = teclado.nextInt();

        for (int linha = 1; linha <= n; linha++) {

            for (int coluna = 1; coluna <= linha; coluna++) {

                System.out.print(numero + " ");
                numero++;
            }

            System.out.println();
            teclado.close();
        }
    }
}
