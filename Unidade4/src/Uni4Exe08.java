import java.util.Scanner;

public class Uni4Exe08 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Informa a letra: ");
            char letra = teclado.next().toLowerCase().charAt(0);

            if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                System.out.println("É uma vogal!");
            }
            else{
                System.out.println("NÃO é uma vogal.");
            }
            teclado.close();
        }
}
//Grupo COMPOSTO E e OU (&& e ||)
//Uni4Exe08.java
//Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
//Para resolver este problema pode se utilizar do algoritmo descrito no FLUXOGRAMA