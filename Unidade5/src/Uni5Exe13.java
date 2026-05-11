import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int totalReabastecimentos;

        double Km;
        double combustivel;

        double somaKm = 0;
        double somaCombustivel = 0;

        System.out.print("Número total de reabastecimentos: ");
        totalReabastecimentos = teclado.nextInt();

        for (int parada = 1; parada <= totalReabastecimentos; parada++) {

            System.out.print("Parada " + parada + " ---> Quilometragem: ");
            Km = teclado.nextDouble();

            System.out.print("Parada " + parada + " ---> Combustível: ");
            combustivel = teclado.nextDouble();

            double consumo = Km / combustivel;

            System.out.println("Parada " + parada + ": " + consumo + " km por litro.");

            somaKm += Km;
            somaCombustivel += combustivel;
        }

        double media = somaKm / somaCombustivel;

        System.out.printf("Quilometragem média obtida por litro: %.2f", media);
        teclado.close();
    }
}

