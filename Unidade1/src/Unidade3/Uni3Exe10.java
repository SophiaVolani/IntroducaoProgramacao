package Unidade3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Exe10 {
    private float cateto1;
    private float cateto2;
    private float hipotenusa;

    public Uni3Exe10(float cateto1, float cateto2){
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    
    }

    public float calcularHipotenusa(){
        this.cateto1 = (float) Math.pow(this.cateto1,2);
        this.cateto2 = (float) Math.pow(this.cateto2,2);
        hipotenusa = (float) Math.pow(hipotenusa, 2);

        hipotenusa = this.cateto1 + this.cateto2;
        hipotenusa = (float) Math.sqrt(hipotenusa);

        return (hipotenusa);
    }

    public static void main(String[] args) {
        System.out.println("Qual o cateto oposto da hipotenusa? ");
        Scanner teclado = new Scanner(System.in);
        float cateto1 = teclado.nextFloat();

        System.out.println("Qual o cateto adjascente da hipotenusa?  ");
        float cateto2 = teclado.nextFloat();

        Uni3Exe10 uni3Exe10 = new Uni3Exe10(cateto1, cateto2);

        DecimalFormat df = new DecimalFormat("0.00");

        
        System.out.println("O valor da hipotenusa é: " + df.format(uni3Exe10.calcularHipotenusa()));

        teclado.close();




    }
}
