import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni2Exe08 {
    public static void main(String[] args) {
        int codigoPeca1, numeroPeca1, codigoPeca2, numeroPeca2;
        float valorUnitarioPeca1, valorUnitarioPeca2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o código da peça 1: ");
        codigoPeca1 = teclado.nextInt();

        System.out.println("Digite a quantidade de peças 1: ");
        numeroPeca1 = teclado.nextInt();

        System.out.println("Digite o valor unitário da peça 1: ");
        valorUnitarioPeca1 = teclado.nextFloat();


        System.out.println("Digite o código da peça2: ");
        codigoPeca2 = teclado.nextInt();

        System.out.println("Digite a quantidade de peças 2: ");
        numeroPeca2 = teclado.nextInt();

        System.out.println("Digite o valor unitário da peça 2: ");
        valorUnitarioPeca2 = teclado.nextFloat();

        float valorTotalPeca1 = numeroPeca1 * valorUnitarioPeca1;
        float valorTotalPeca2 = numeroPeca2 * valorUnitarioPeca2; 

        float valorTotal = valorTotalPeca1 + valorTotalPeca2;


        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.println("O valor total da peça de código " + codigoPeca1 + " é: R$ " + df.format(valorTotalPeca1));
        System.out.println("O valor total da peça de código " + codigoPeca2 + " é: R$ " + df.format(valorTotalPeca2));
        System.out.println("O valor total das duas peças é de: R$ " + df.format(valorTotal));

        teclado.close();

    }
}
