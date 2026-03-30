import java.util.Scanner;

public class Diagrama {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a sua idade:  ");
        int idade = teclado.nextInt();

        
        if (idade >= 18){
            System.out.println("Adulto");
        }

        else if (idade > 6 && idade < 18){
            System.out.println("Criança");
        }

        else{
            System.out.println("Infantil");
        }

        teclado.close();

    }
}
