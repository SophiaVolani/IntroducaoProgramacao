
import java.util.Scanner;

public class Uni2Exe11 {
    public static void main(String[] args) {
        double A, B, C;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        A = teclado.nextDouble();

        System.out.println("Digite o valor de B: ");
        B = teclado.nextDouble();

        System.out.println("Digite o valor de C: ");
        C = teclado.nextDouble();


        double areaTriangulo = (A * C) / 2;
        double areaCirculo = Math.PI * Math.pow(C, 2); //Math.pow eleva um número a uma potência ->ex: C ao quadrado.
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = Math.pow(B, 2);
        double areaRetangulo = A * B;

        System.out.println("a) Área do triângulo: " + areaTriangulo);
        System.out.println("b) Área do círculo: " + areaCirculo);
        System.out.println("c) Área do trapézio: " + areaTrapezio);
        System.out.println("d) Área do quadrado: " + areaQuadrado);
        System.out.println("e) Área do retângulo: " + areaRetangulo);

        teclado.close();
    }
}
