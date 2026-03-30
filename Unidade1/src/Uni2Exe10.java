
import java.util.Scanner;

public class Uni2Exe10 {
    public static void main(String[] args) {
        int duracaoSegundos;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a duração do evento em segundos: ");
        duracaoSegundos = teclado.nextInt();

        int horas = duracaoSegundos / 3600; //1h = 3600 segundos
        int minutos = (duracaoSegundos % 3600) / 60; 
        int segundos = duracaoSegundos % 60;

        System.out.println("a duração do evento foi de " + horas + "h:" + minutos + "m:" + segundos + "s.");
        teclado.close();  
    }
}

