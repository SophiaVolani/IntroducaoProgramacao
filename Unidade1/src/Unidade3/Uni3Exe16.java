package Unidade3;

import java.util.Scanner;

public class Uni3Exe16 {
    private int valorTotal;
    private int valorPago;

    public Uni3Exe16(int valorTotal, int valorPago){
        this.valorPago = valorPago;
        this.valorTotal = valorTotal;
    }

    public int troco(){
        return this.valorPago - this.valorTotal;
    }

    public int notasDeCem(){
        return troco() / 100;
    }

    public int notasDeDez(){
        return (troco() % 100) / 10;
    }

    public int notaDeUm(){
        return troco() % 10;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        int valorTotal = teclado.nextInt();

        System.out.println("Digite o valor que foi pago: ");
        int valorPago = teclado.nextInt();

        Uni3Exe16 exe16 = new Uni3Exe16(valorTotal, valorPago);

        int totalNotas = exe16.notasDeCem() + exe16.notasDeDez() + exe16.notaDeUm();

        System.out.println("O número mínimo de notas de troco é: " + totalNotas);
        System.out.println("Quantidade de notas de 100 necessárias é: " + exe16.notasDeCem());
        System.out.println("Quantidade de notas de 10 necessárias é: " + exe16.notasDeDez());
        System.out.println("Quantidade de notas de 1 necessárias é: " + exe16.notaDeUm());

        teclado.close();

    }
}
