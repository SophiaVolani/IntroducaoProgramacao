package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe08 {
    private float valorCliente;
    private float cotacaoDolar = 5.65f;

    public Uni3Exe08 (float valorCliente){
        this.valorCliente = valorCliente;
        
    }

    public float calcularDolarRecebido(){
        return (this.valorCliente * cotacaoDolar);
    }

    public static void main(String[] args) {
        System.out.println("Bem vindo à Casa de Câmbio! Quantos dólares você deseja trocar? ");
        Scanner teclado = new Scanner(System.in);
        float valorCliente = teclado.nextFloat();

        Uni3Exe08 uni3Exe08 = new Uni3Exe08(valorCliente);

        DecimalFormat df = new DecimalFormat("0.00");

        
        System.out.println("Parabéns! O valor trocado em dólares é de R$" + df.format(uni3Exe08.calcularDolarRecebido()));

        teclado.close();

    }





}
