import java.util.Scanner;
import java.lang.Math;

public class Uni2Exe20 {
    public static void main(String[] args) {
        int qntDobras, qntQuadrados;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de dobras (em números pares): ");
        qntDobras = teclado.nextInt();

        if (qntDobras % 2 != 0) {
            System.out.println("A quantidade de dobras deve ser um número par.");
            teclado.close();
            return;
        }

        qntQuadrados = (int)Math.pow(qntDobras, 2);
        System.out.println("As dobraduras formaram " + qntQuadrados + " quadrados.");
        teclado.close();
    }
}
