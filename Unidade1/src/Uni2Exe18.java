
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe18 {
    public static void main(String[] args) {
        float comprimento, altura;
        float azulejo = 12.50f;
        float metroQuadrado = 9f * azulejo;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quantos metros mede  o comprimento da parede: ");
        comprimento = teclado.nextFloat();

        System.out.println("Digite quantos metros mede a altura da parede: ");
        altura = teclado.nextFloat();

        float areaParede = comprimento * altura;

        float TotalCompra = metroQuadrado * areaParede;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("O valor total gasto com a compra dos azulejos é de " + df.format(TotalCompra) + " reais.");
        teclado.close();
    }
}
