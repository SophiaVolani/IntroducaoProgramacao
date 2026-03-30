package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe14 {
    private float distanciaPercorrida;
    private float tempo;


    public Uni3Exe14(float distanciaPercorrida, float tempo){
        this.distanciaPercorrida = distanciaPercorrida;
        this.tempo = tempo;
    }

    public float calcularVelocidadeMedia(){
        return(this.distanciaPercorrida / this.tempo);
    }

    public float calcularCombustivel(){
        return(this.distanciaPercorrida / 12f);
    }

    public static void main(String[] args) {
        System.out.println("Qual a distância percorrida na viagem? ");
        Scanner teclado = new Scanner(System.in);
        float distanciaPercorrida = teclado.nextFloat();

        System.out.println("Quanto tempo levou até o final da viagem? ");
        float tempo = teclado.nextFloat();

        Uni3Exe14 uni3Exe14 = new Uni3Exe14(distanciaPercorrida, tempo);

        DecimalFormat df = new DecimalFormat("0.00");

        
        System.out.println("A velocidade média do carro foi de " + df.format(uni3Exe14.calcularVelocidadeMedia()) + " km/h e a quantidade de combustível usado foi de " + df.format(uni3Exe14.calcularCombustivel()) + " litros.");
        
        teclado.close();
    }



}
