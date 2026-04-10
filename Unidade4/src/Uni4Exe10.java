import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        int Marquinhos, Zezinho, Luluzinha;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade do Marquinhos: ");
        Marquinhos = teclado.nextInt();

        System.out.println("Digite a idade do Zezinho: ");
        Zezinho = teclado.nextInt();

        System.out.println("Digite a idade da Luluzinha: ");
        Luluzinha = teclado.nextInt();

        if(Marquinhos > Zezinho && Zezinho < Luluzinha ){
            System.out.println("Zezinho é o caçula!");
        }
        else if(Marquinhos > Luluzinha && Luluzinha < Zezinho){
            System.out.println("Luluzinha é a caçula!");
        }
        else{
            System.out.println("Marquinhos é o caçula!");
        }
        teclado.close();
    }
}
