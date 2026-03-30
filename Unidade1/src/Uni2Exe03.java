import java.util.Scanner;
import java.lang.Math;

public class Uni2Exe03 {
    public static void main(String[] args) {
        double raio = 0;
        double area = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do raio da circunferência: ");

        raio = teclado.nextDouble();

        area = Math.pow(raio, 2) * Math.PI;

        System.out.println("Área da circunferência: " + area);
        
        teclado.close();
    }
}
