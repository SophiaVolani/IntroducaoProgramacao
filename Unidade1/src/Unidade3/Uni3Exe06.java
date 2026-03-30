package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe06 {
    private float quiloRefeicao = 25.0f;
    private float pesoPrato = 0.75f;
    private float pratoCliente;

    public Uni3Exe06(float pratoCliente){
        this.pratoCliente = pratoCliente;
    }

    public float calcularPratoMontado(){
        return (this.pratoCliente - this.pesoPrato) * quiloRefeicao;
    }

    public static void main(String[] args) {
        System.out.println("Digite o peso do seu prato em quilos: ");
        Scanner teclado = new Scanner(System.in);
        float pratoCliente = teclado.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00");   

        Uni3Exe06 uni3Exe06 = new Uni3Exe06(pratoCliente);

        System.out.println("O peso a pagar pelo prato é: R$" + df.format(uni3Exe06.calcularPratoMontado()));

        teclado.close();


    }

}
