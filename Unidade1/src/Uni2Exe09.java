
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni2Exe09 {
    public static void main(String[] args) {
        float valorDolar;
        float cotacaoDolar = 5.25f;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo(a) à casa de câmbio FURB! A cotação do dólar hoje é de: R$ " + cotacaoDolar);
        System.out.println("Agora, digite o valor em dólares que você deseja trocar: ");
        valorDolar = teclado.nextFloat();

        float valorReal = valorDolar * cotacaoDolar;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println(("O valor trocado em reais é de R$: "+ df.format(valorReal) + ". Muito obrigada pela preferência!"));
        teclado.close();

        

    }
}