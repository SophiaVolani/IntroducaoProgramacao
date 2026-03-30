
import java.util.Scanner;
public class Uni2Exe19 {
    public static void main(String[] args) {
        double A, B, C, D;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de B: ");
        B = teclado.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = teclado.nextDouble();

        System.out.println("Digite o valor de D: ");
        D = teclado.nextDouble();

        A = (B * C) / D;

        System.out.println("O valor de A é: " + A );

        teclado.close();
    }
}
