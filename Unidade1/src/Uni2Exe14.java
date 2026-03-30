
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe14 {
    public static void main(String[] args) {
        int valor, QntTotalCedulas, cedula100, cedula50, cedula20, cedula10, cedula5, cedula2, moeda1;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        valor = teclado.nextInt();

        cedula100 = valor / 100;
        cedula50 = (valor % 100) / 50;
        cedula20 = ((valor % 100) % 50) / 20;
        cedula10 = (((valor % 100) % 50) % 20) / 10;
        cedula5 = ((((valor % 100) % 50) % 20) % 10) / 5;
        cedula2 = (((((valor % 100) % 50) % 20) % 10) % 5) / 2;
        moeda1 = ((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1;

        QntTotalCedulas = cedula100 + cedula50 + cedula20 + cedula10 + cedula5 + cedula2 + moeda1;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("O Valor recebido é R$ " + df.format(valor) + " e foram necessárias " + QntTotalCedulas + " cédulas para obter o valor recebido.");

        System.out.println("Quantidade de cédulas de R$ 100,00: " + cedula100);
        System.out.println("Quantidade de cédulas de R$ 50,00: " + cedula50);
        System.out.println("Quantidade de cédulas de R$ 20,00: " + cedula20);
        System.out.println("Quantidade de cédulas de R$ 10,00: " + cedula10);
        System.out.println("Quantidade de cédulas de R$ 5,00: " + cedula5);
        System.out.println("Quantidade de cédulas de R$ 2,00: " + cedula2);
        System.out.println("Quantidade de moedas de R$ 1,00: " + moeda1);

        teclado.close();
    }
}
