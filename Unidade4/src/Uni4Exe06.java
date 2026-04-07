import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite M para masculino, F para feminino ou I para Não Informado.");
        char letra = teclado.next().toUpperCase().charAt(0);

        if (letra == 'M'){
            System.out.println("Masculino.");
        }
        else if (letra == 'F'){
            System.out.println("Feminino.");
        }
        else if (letra == 'I'){
            System.out.println("Não Informado.");
        }
        else{
            System.out.println("Entrada incorreta! Tente novamente.");
        }
        teclado.close();
    }
}
