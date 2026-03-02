import java.util.Scanner;

public class AreaDaSalaInformada {
    public static void main(String[] args) {
        float frente = 0;
        float lateral = 0;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor da frente da sala:");
        frente = teclado.nextFloat();

        System.out.println(("Informe o valor da lateral da sala:"));
        lateral = teclado.nextFloat();

        float area = frente * lateral;
        System.out.println((("Área da sala é: " + area + "m²")));

        teclado.close();
    }  
}
