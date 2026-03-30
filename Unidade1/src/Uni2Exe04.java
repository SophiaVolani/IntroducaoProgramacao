import java.util.Scanner;

public class Uni2Exe04 {
    public static void main(String[] args) {
        float notaA, notaB;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor da primeira nota: ");
        notaA = teclado.nextFloat();

        System.out.println("Digite o valor da segunda nota: ");
        notaB = teclado.nextFloat();

        float mediaponderada = ((notaA * 3.5f) + (notaB * 7.5f))/11;
        //divide por 11 pois a soma dos pesos é 3.5 + 7.5 = 11

        System.out.println(("A média ponderada entre as duas notas é: " + mediaponderada));
        teclado.close();
    }
}
