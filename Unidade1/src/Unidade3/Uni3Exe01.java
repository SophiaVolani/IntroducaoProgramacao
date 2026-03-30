package Unidade3;

import java.util.Scanner;

public class Uni3Exe01 {
    private int largura;
    private int comprimento;
    //construtor
    public Uni3Exe01(int largura, int comprimento){
        this.largura = largura;
        this.comprimento = comprimento;}

    public int calcularArea(){
        return this.largura * this.comprimento;
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int largura, comprimento;
        System.out.println("Digite a largura do terreno: ");
        largura = teclado.nextInt();
        System.out.println("Digite o comprimento do terreno: ");
        comprimento = teclado.nextInt();

        Uni3Exe01 uni3Exe01 = new Uni3Exe01(largura, comprimento);
        int area = uni3Exe01.calcularArea();
        System.out.println("A área Total do terreno é: " + area + "m²");
        teclado.close();
    }
}
