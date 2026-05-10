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
        else if(minutos >= 30){
            horas++;
        }

        float valor = 0;

        if (horas <= 2){
            valor = horas * 5.0f;
        }
        else if(horas <= 4){
            valor = (2 * 5f) + ((horas - 2f) * 7.5f);
        }
        else{
            valor = (2 * 5.0f) + (2 * 7.5f) + ((horas - 4) * 10f);
        }

        System.out.printf("Preço cobrado = R$%.2f", valor);
        teclado.close();
    }
}

//As tarifas de um estacionamento são as seguintes:

//1° e 2° hora - R$ 5,00 cada
//3° e 4° hora - R$ 7,50 cada
//5° hora e seguintes - R$ 10,00 cada

//O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para baixo e após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15 minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos. Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior a 24 horas, e sempre chegam e saem no mesmo dia.