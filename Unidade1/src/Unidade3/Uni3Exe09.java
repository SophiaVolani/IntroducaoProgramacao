package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe09 {
    private double raio;
    private float altura;

    public Uni3Exe09 (double raio, float altura){
        this.raio = raio;
        this.altura = altura;
        
    }

    public double calcularVolume(){
        double raio2 = Math.pow(raio, 2);
        double pi = 3.141592653589793;
        return ( pi * raio2 * this.altura);
    }

    public static void main(String[] args) {
        System.out.println("Qual o raio do volume da Lata de Óleo? ");
        Scanner teclado = new Scanner(System.in);
        double raio = teclado.nextDouble();

        System.out.println("Qual a altura do volume da Lata de Óleo? ");
        float altura = teclado.nextFloat();

        Uni3Exe09 uni3Exe09 = new Uni3Exe09(raio, altura);

        DecimalFormat df = new DecimalFormat("0.00");

        
        System.out.println("O volume da lata de óleo é de: " + df.format(uni3Exe09.calcularVolume()));

        teclado.close();

    }
}
