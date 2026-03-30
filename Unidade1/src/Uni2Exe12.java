

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe12 {
    public static void main(String[] args) {
        float x1, y1, x2, y2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de x1: ");
        x1 = teclado.nextFloat();

        System.out.println("Digite o valor de y1: ");
        y1 = teclado.nextFloat();

        System.out.println("Digite o valor de x2: ");
        x2 = teclado.nextFloat();

        System.out.println("Digite o valor de y2: ");
        y2 = teclado.nextFloat();


        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        DecimalFormat df = new DecimalFormat("0.0000");
        

        System.out.println("A distância entre os pontos é: " + df.format(distancia));

        teclado.close();

    }
}
