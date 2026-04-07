import java.util.Scanner;

public class Uni4Exe04 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite um número: ");
            float numero = teclado.nextFloat();

            if (numero % 1 != 0) {
                System.out.println("Esse número tem casas decimais.");
            } else {
                System.out.println("Esse número não tem casas decimais.");
            }
            teclado.close();
    }
}
