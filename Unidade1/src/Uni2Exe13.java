
import java.util.Scanner;

public class Uni2Exe13 {
    public static void main(String[] args) {
        double distanciaKm;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a distância em Km: ");

        distanciaKm = teclado.nextDouble();

        double tempoMinutos = distanciaKm * 2; // 2 min por km
        System.out.println("O carro Y levará " + tempoMinutos + " minutos para tomar a distância de " + distanciaKm + " Km do carro X.");
        teclado.close();

    }
}
