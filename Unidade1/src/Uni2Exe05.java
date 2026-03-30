import java.util.Scanner;

public class Uni2Exe05 {
    public static void main(String[] args) {
        int A, B, C, D;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        A = teclado.nextInt();

        System.out.println("Digite o valor de B: ");
        B = teclado.nextInt();

        System.out.println("Digite o valor de C: ");
        C = teclado.nextInt();

        System.out.println("Digite o valor de D: ");
        D = teclado.nextInt();

        int diferenca = (A * B) - (C * D);
        System.out.println("A Diferença entre os valores é: " + diferenca);
        
        teclado.close();

    }
}
