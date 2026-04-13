import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        int horaChegada, minChegada, horaSaida, minSaida;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a hora de chegada: ");
        horaChegada = teclado.nextInt();

        System.out.println("Digite os minutos de chegada: ");
        minChegada = teclado.nextInt();

        System.out.println("Digite a hora de saída: ");
        horaSaida = teclado.nextInt();

        System.out.println("Digite os minutos de saída: ");
        minSaida = teclado.nextInt();

        int inicio = horaChegada * 60 + minChegada;
        int fim = horaSaida * 60 + minSaida;

        int tempo = fim - inicio;

        int horas = tempo / 60;
        int minutos = tempo % 60;

        if (tempo <= 30){
            horas = 1;
        }
        else if(minutos >= 30) {
            horas++;
        }

        float valor = 0;

        if (horas <= 2) {
            valor = horas * 5.0f;
        }
        else if(horas <= 4) {
            valor = (2 * 5f) + ((horas - 2f) * 7.5f);
        }
        else{
            valor = (2 * 5.0f) + (2 * 7.5f) + ((horas - 4) * 10f);
        }

        System.out.printf("Preço cobrado = R$%.2f", valor);

        teclado.close();
    }
}
