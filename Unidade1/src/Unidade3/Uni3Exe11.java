package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe11 {
    private float grausCelsius;

    public Uni3Exe11(float grausCelsius){
        this.grausCelsius = grausCelsius;
    }

    public float calcularGrausCparaF(){
        float grausFahrenheit = 1.8f * grausCelsius + 32f;
        return(grausFahrenheit);
    }

    public static void main(String[] args) {
        System.out.println("Quantos Graus Celsius você quer converter para Graus Fahrenheit?  ");
        Scanner teclado = new Scanner(System.in);
        float grausCelsius = teclado.nextFloat();


        Uni3Exe11 uni3Exe11 = new Uni3Exe11(grausCelsius);

        DecimalFormat df = new DecimalFormat("0.0");

        
        System.out.println( df.format(grausCelsius) +"C° é igual à  " + df.format(uni3Exe11.calcularGrausCparaF()) + "F°.");

        teclado.close();


    }
}
