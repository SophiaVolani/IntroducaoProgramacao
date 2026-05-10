//tem que corrigir (ver o que está errado) 

import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        int carta1, carta2, carta3;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Informa as 3 cartas: ");
        carta1 = teclado.nextInt();
        carta2 = teclado.nextInt();
        carta3 = teclado.nextInt();

        int qntCartasBoas = 0;

        if(carta1 == 1 || carta1 == 2 || carta1 == 3){
            qntCartasBoas += 1;
        }
        if(carta2 == 1 || carta2 == 2 || carta2 == 3){
            qntCartasBoas = qntCartasBoas + 1;
        }
        if(carta3 == 1 || carta3 == 2 || carta3 == 3){
            qntCartasBoas++;
        }
        
        if (qntCartasBoas == 1){
            System.out.println("TRUCO");
        }
        else if(qntCartasBoas == 2){
            System.out.println("SEIS");
        }
        else if(qntCartasBoas == 3){
            System.out.println("NOVE");
        }
        else{
            System.out.println(" ");
        }
        teclado.close();
    }
}
//Escreva um algoritmo que obtém do usuário 3 valores inteiros representando as três cartas deste usuário em uma mão de jogo de truco (1 = AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei). O algoritmo deve imprimir na tela a palavra "TRUCO" (se APENAS UMA das três cartas for AS, 2 ou 3), "SEIS" (se APENAS DUAS das três cartas for AS, 2 ou 3) ou "NOVE" (se AS TRÊS cartas forem AS, 2 ou 3). Se não houver AS, 2 ou 3 nas três cartas, não é impresso nada.
//Dica: criar variáveis intermediárias para contar a quantidade de "boas".