import java.util.Scanner;

public class Uni4Exe02 {
    float valor;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com um valor inteiro maior do que 0: ");
        float valor = teclado.nextFloat();


        if (valor % 2 == 0){
           System.out.println("Esse Número é par!"); 
        }
        else{
            System.out.println("Esse Número é ímpar.");
        }
        
        teclado.close();
    }
}
