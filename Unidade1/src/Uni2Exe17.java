
import java.util.Scanner;
import java.text.DecimalFormat;
public class Uni2Exe17 {
    public static void main(String[] args) {
        String nome;
        float horasTrabalhadas;
        int numeroDependentes;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        nome = teclado.nextLine();

        System.out.println("Digite o número de horas trabalhadas no mês: ");
        horasTrabalhadas = teclado.nextFloat();

        System.out.println("Digite o número de dependentes na família do funcionário: ");
        numeroDependentes = teclado.nextInt();

        float salarioTrabalho = 10f * horasTrabalhadas;
        float salarioFamilia = 60f * numeroDependentes;

        float salarioBruto = salarioTrabalho + salarioFamilia;

        float descontoINSS = salarioTrabalho * 0.085f;
        float descontoImpostoRenda = salarioTrabalho * 0.05f;

        float salarioLiquido = salarioBruto - descontoINSS - descontoImpostoRenda;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Nome: " + nome);
        System.out.println("Salário Bruto: " + df.format(salarioBruto) + " reais.");
        System.out.println("Salário Líquido: " + df.format(salarioLiquido) + " reais.");

        teclado.close();
    }
}
