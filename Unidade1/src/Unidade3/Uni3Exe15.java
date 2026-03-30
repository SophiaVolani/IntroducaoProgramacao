package Unidade3;

import java.util.Scanner;

public class Uni3Exe15 {
    private int numeroInteiro;

    public Uni3Exe15(int numeroInteiro){
        this.numeroInteiro = numeroInteiro;
    }

    public boolean verificarNumero(){
        return numeroInteiro >= 100 && numeroInteiro <= 999;
    }

    public int calcularCentena(){
        return(numeroInteiro / 100);
    }

    public int calcularDezena(){
        return((numeroInteiro % 100)/ 10);
    }

    public int calcularUnidade(){
        return(((numeroInteiro % 100)% 10)/ 1);
    }

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro com 3 casas. (ex:698)  ");
        Scanner teclado = new Scanner(System.in);
        int numeroInteiro = teclado.nextInt();


        Uni3Exe15 uni3Exe15 = new Uni3Exe15(numeroInteiro);

        if(!uni3Exe15.verificarNumero()){
            System.out.println("Você deve digitar um número com exatamente 3 casas. Tente novamente.");
        }
        
        else{
            System.out.println(uni3Exe15.calcularCentena() + " centena(s) " + uni3Exe15.calcularDezena() + " dezena(s) "+ uni3Exe15.calcularUnidade() + " unidade(s). ");
        }

        teclado.close();
    }

}
