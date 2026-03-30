import java.util.Scanner;

public class Uni4Exe01 {
    float horasMes;
    float valorHora;
    float salarioTotalFuncionario = valorHora * valorHora;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva as horas trabalhadas no mês: ");
        float horasMes = teclado.nextFloat();

        System.out.println("Entre com o valor pago por hora: ");
        float valorHora = teclado.nextFloat();

        float salarioTotalFuncionario = horasMes * valorHora;

        if (horasMes > 160){
            float salarioExtra = (horasMes - 160) * (valorHora / 2); 
            salarioTotalFuncionario = salarioTotalFuncionario + salarioExtra;
        }
        else{

        }
        System.out.println("O salário total é: "+ salarioTotalFuncionario);
        teclado.close();
    }
}
