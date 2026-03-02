import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {

        float nota1 = 0.0f;
        float nota2 = 0.0f;
        float nota3 = 0.0f;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = teclado.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = teclado.nextFloat();

        float media = (nota1 + nota2 + nota3) /3;

        System.out.println("A média é: " + media);

        teclado.close();
        
    }
}
