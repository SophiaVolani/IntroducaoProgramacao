import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        int diaVencimento, diaPagamento;
        float valor, valorTotal;

        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Digite o dia do vencimento: ");
        diaVencimento = teclado.nextInt();

        System.out.print("Digite o dia do pagamento: ");
        diaPagamento = teclado.nextInt();

        System.out.print("Digite o valor da prestação: ");
        valor = teclado.nextFloat();

        int diaAtraso = diaPagamento - diaVencimento;

        if (diaPagamento <= diaVencimento) {
            valorTotal = valor - (valor * 0.10f);
            System.out.println("O pagamento está em dia.");
            System.out.println("O valor da prestação = R$"+ df.format(valorTotal));

        } else if (diaAtraso <= 5) {
            valorTotal = valor;
            System.out.println("O pagamento está atrasado (sem multa).");
            System.out.println("O valor da prestação = R$"+ df.format(valorTotal));

        } else {
            valorTotal = valor + (valor * 0.02f * diaAtraso);
            System.out.println("O pagamento está atrasado.");
            System.out.println("Multa de 2% por dia de atraso.");
            System.out.println("Valor da prestação = R$"+  df.format(valorTotal));
        }

        
        teclado.close();
    }
}