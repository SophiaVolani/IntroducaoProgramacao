// Uma granja possui um controle automatizado de cada frango da sua produção. No pé direito do frango há um
// anel com um chip de identificação; no pé esquerdo são dois anéis para indicar o tipo de alimento que 
//ele deve consumir. Sabendo que o anel com chip custa R$ 4,00 e o anel de alimento custa R$ 3,50,
// faça um programa para calcular o gasto total da granja para marcar todos os seus frangos.


package Unidade3;

import java.text.DecimalFormat;

import java.util.Scanner;

public class Uni3Exe05 {
    private int qntFrangos;
    private float valorChipID = 4.00f, valorAnelAlimento = 3.50f;

    public Uni3Exe05(int qntFrangos){
        this.qntFrangos = qntFrangos;
    }

    public float gastoTotalGranja(){
        return this.qntFrangos * (this.valorChipID + 2 * this.valorAnelAlimento);
    }

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de frangos na granja: ");
        Scanner teclado = new Scanner(System.in);
        int qntFrangos = teclado.nextInt();


        DecimalFormat df = new DecimalFormat("0.00");

        Uni3Exe05 uniExe05 = new Uni3Exe05(qntFrangos);
        
        System.out.println("O valor total gasto para marcar os frangos é: R$ " + df.format(uniExe05.gastoTotalGranja()));
        teclado.close();
    }
}
