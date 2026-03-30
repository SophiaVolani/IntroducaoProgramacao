import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe07 {
    public static void main(String[] args) {
        String nomeVendedor;
        float salarioFixo;
        float totalVendas;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do vendedor: ");
        nomeVendedor = teclado.nextLine();

        System.out.println("Digite o salário fixo do vendedor (ex:. 12000,20): ");
        salarioFixo = teclado.nextFloat();

        System.out.println("Digite o total de vendas do vendedor em dinheiro (ex:. 3750,50): ");
        totalVendas = teclado.nextFloat();

        float salarioFinal = salarioFixo + (totalVendas * 0.15f);
        
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("O salário final do vendedor " + nomeVendedor + " é: R$ " + df.format(salarioFinal));
        
        teclado.close();
    }   
}
