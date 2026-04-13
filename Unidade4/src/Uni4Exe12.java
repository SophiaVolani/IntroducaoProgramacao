import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        float lado1, lado2, lado3;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o comprimento do lado 1: ");
        lado1 = teclado.nextFloat();

        System.out.println("Digite o comprimento do lado2: ");
        lado2 = teclado.nextFloat();

        System.out.println("Digite o comprimento do lado3: ");
        lado3 = teclado.nextFloat();

        if(lado1 < (lado2 + lado3) && lado2 < (lado1 + lado3) && lado3 < (lado1 + lado2)){
            if(lado1 == lado2 && lado1 ==lado3){
                System.out.println("O triângulo é equilátero!");
            }
            else if(lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
                System.out.println("O triângulo é isósceles!");
            }
            else{
                System.out.println("O triângulo é escaleno!");
            }
        }
        else{
            System.out.println("não formam um triângulo.");
        }
        teclado.close();
    }
}
