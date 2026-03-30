import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        int funcionario;
        float horasTrabalhadas, valorHora, salario;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número do funcionário (ex: 020) : ");
        funcionario = teclado.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas (ex:. 120) : ");
        horasTrabalhadas = teclado.nextFloat();

        System.out.println("Digite o valor da hora trabalhada (ex:. 10,50) : ");
        valorHora = teclado.nextFloat();

        salario = horasTrabalhadas * valorHora;

        DecimalFormat df = new DecimalFormat("0.02");
        System.out.printf("O funcionário de número de identificação " + funcionario + " tem um salário de "
                + df.format(salario) + " reais.");
        teclado.close();

    }
}
