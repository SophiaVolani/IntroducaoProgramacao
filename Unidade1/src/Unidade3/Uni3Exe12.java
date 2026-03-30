package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe12 {
    private String nome;
    private float horasTrabalhadas;
    private int numeroDependentes;

    public Uni3Exe12(String nome, float horasTrabalhadas, int numeroDependentes){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.numeroDependentes = numeroDependentes;
    }

    public float calcularSalarioTrabalho(){
        return(horasTrabalhadas * 10f);
    }

    public float calcularSalarioFamilia(){
        return(numeroDependentes * 60f);
    }

    public float calcularSalarioBruto(){
        return(calcularSalarioTrabalho() + calcularSalarioFamilia());
    }

    public float descontos(){
        float descontoINSS = calcularSalarioTrabalho() * 0.085f;
        float descontoIRPF = calcularSalarioTrabalho() * 0.05f;
        float salarioLiquido = calcularSalarioBruto() - descontoINSS - descontoIRPF;
        return(salarioLiquido);
    }

    public static void main(String[] args) {
        System.out.println("Qual o nome do funcionário? ");
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();

        System.out.println("Quantas horas o funcionário trabalhou esse mês? ");
        float horasTrabalhadas = teclado.nextFloat();

        System.out.println("Quantos dependentes o funcionário possui? ");
        int numeroDependentes = teclado.nextInt();

        Uni3Exe12 uni3Exe12 = new Uni3Exe12(nome, horasTrabalhadas, numeroDependentes);

        DecimalFormat df = new DecimalFormat("0.00");

        
        System.out.println("O funcionário " + nome + " possui um salário bruto de R$" + df.format(uni3Exe12.calcularSalarioBruto()) + " e um salário líquido de R$" + df.format(uni3Exe12.descontos())  );
        teclado.close();
    }





}
