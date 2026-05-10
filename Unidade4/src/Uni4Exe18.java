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
//Uma loja que trabalha com crediário funciona da seguinte maneira: se o pagamento ocorre até o dia do vencimento, o cliente ganha 10% de desconto e é avisado que o pagamento está em dia. Se o pagamento é realizado até cinco dias após o vencimento o cliente perde o desconto, e se o pagamento atrasa mais de cinco dias, é cobrada uma multa de 2% por cada dia de atraso. Faça um algoritmo que leia o dia do vencimento, o dia do pagamento e o valor da prestação e calcule o valor a ser pago pelo cliente, exibindo as devidas mensagens. Suponha que todo vencimento ocorre até o dia dez de cada mês e os clientes nunca deixam para pagar no mês seguinte.