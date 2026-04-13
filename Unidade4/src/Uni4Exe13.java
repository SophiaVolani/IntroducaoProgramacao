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
