import java.util.Scanner;

public class Uni4Exe03 {
    int numero1, numero2;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = teclado.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.println("O valor "+ numero1 +" é maior do que o valor "+ numero2 + ".");
        }
        else{
            System.out.println("O valor "+ numero2 +" é maior do que o valor "+ numero1 + ".");
        }
        teclado.close();
    }
}
