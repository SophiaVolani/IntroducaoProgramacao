package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe13 {
    float valorAzulejo = 12.5f;
    float comprimento, altura;
    float metroQuadrado = 9 * valorAzulejo;

    public Uni3Exe13(float comprimento, float altura){
        this.comprimento = comprimento;
        this.altura = altura;;
    }

    public float calcularAreaParede(){
        return(this.comprimento * this.altura);
    }

    public float calcularGastoTotal(){
        return(calcularAreaParede() * this.metroQuadrado);
    }

    public static void main(String[] args) {
        System.out.println("Quantos metros tem a altura da parede? ");
        Scanner teclado = new Scanner(System.in);
        float altura = teclado.nextFloat();

        System.out.println("Quantos metros tem o comprimento da parede? ");
        float comprimento = teclado.nextFloat();

        Uni3Exe13 uni3Exe13 = new Uni3Exe13(comprimento, altura);

        DecimalFormat df = new DecimalFormat("0.00");

        
        System.out.println("O valor total gasto com a compra de azulejos é de R$" + df.format(uni3Exe13.calcularGastoTotal()));
        teclado.close();
    }


}
