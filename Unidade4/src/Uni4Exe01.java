//A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
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
