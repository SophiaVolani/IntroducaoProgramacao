package Unidade3;

import java.util.Scanner;

public class Uni3Exe2 {
    private float valorCalcado;
    private float percentualDesconto;

    //construtor
    public Uni3Exe2(float valorCalcado, float percentualDesconto){ //inicializando os atributos da classe
        this.valorCalcado = valorCalcado;
        this.percentualDesconto = percentualDesconto;
    }


public float totalDesconto(){
    return this.valorCalcado * (this.percentualDesconto / 100);
}

public float valorTotalAPagar(){
    return this.valorCalcado - this.totalDesconto();
}

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor do calçado: ");
        float valorCalcado = teclado.nextFloat();

        float valorFixoPercentual = 12.0f;

        Uni3Exe2 classeAula = new Uni3Exe2(valorCalcado, valorFixoPercentual);

        System.out.println("Valor do desconto é de : " + classeAula.totalDesconto());
        System.out.println("Valor total a pagar é de : " + classeAula.valorTotalAPagar());
        teclado.close();
        }
    }
