
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe15 {
    public static void main(String[] args) {
        float valor, QntTotalNotas, cedula100, cedula50, cedula20, cedula10, cedula5, cedula2, moeda1, moeda050, moeda025, moeda010, moeda005, moeda001;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor monetário com duas casas decimais: ");
        valor = teclado.nextFloat();

        cedula100 = (int)(valor / 100);
        cedula50 = (int)((valor % 100) / 50);
        cedula20 = (int)(((valor % 100) % 50) / 20);
        cedula10 = (int)((((valor % 100) % 50) % 20) / 10);
        cedula5 = (int)(((((valor % 100) % 50) % 20) % 10) / 5);
        cedula2 = (int)((((((valor % 100) % 50) % 20) % 10) % 5) / 2);
        moeda1 = (int)(((((((valor % 100) % 50) % 20) % 10) % 5) % 2) / 1);
        moeda050 = (int)((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) / 0.50);
        moeda025 = (int)((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) / 0.25));
        moeda010 = (int)(((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) / 0.10));
        moeda005 = (int)((((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) / 0.05));
        moeda001 = (int)(((((((((((((valor % 100) % 50) % 20) % 10) % 5) % 2) % 1) % 0.50) % 0.25) % 0.10) % 0.05) / 0.01));   

        QntTotalNotas =(int)(cedula100 + cedula50 + cedula20 + cedula10 + cedula5 + cedula2 + moeda1 + moeda050 + moeda025 + moeda010 + moeda005 + moeda001);
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("O Valor recebido é R$ " + df.format(valor) + " e foram necessárias " + (int)(QntTotalNotas) + " notas e moedas para obter o valor recebido.");
        
        System.out.println("Quantidade de notas de R$ 100,00: " + (int)(cedula100));
        System.out.println("Quantidade de notas de R$ 50,00: " + (int)(cedula50));
        System.out.println("Quantidade de notas de R$ 20,00: " + (int)(cedula20));
        System.out.println("Quantidade de notas de R$ 10,00: " + (int)(cedula10));
        System.out.println("Quantidade de notas de R$ 5,00: " + (int)(cedula5));
        System.out.println("Quantidade de notas de R$ 2,00: " + (int)(cedula2));
        System.out.println("Quantidade de moedas de R$ 1,00: " + (int)(moeda1));
        System.out.println("Quantidade de moedas de R$ 0,50: " + (int)(moeda050));
        System.out.println("Quantidade de moedas de R$ 0,25: " + (int)(moeda025));
        System.out.println("Quantidade de moedas de R$ 0,10: " + (int)(moeda010));
        System.out.println("Quantidade de moedas de R$ 0,05: " + (int)(moeda005));
        System.out.println("Quantidade de moedas de R$ 0,01: " + (int)(moeda001));
        
        teclado.close();
    }
}