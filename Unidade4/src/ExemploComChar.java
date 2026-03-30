import java.util.Scanner;

public class ExemploComChar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma vogal: ");

        char letra = teclado.next().toUpperCase().charAt(0);

        switch (letra) {
            case 'A':
                System.out.println("Vogal A digitada");
                break;

            case 'E':
                System.out.println("Vogal E digitada");
                break;

            case 'I':
                System.out.println("Vogal I digitada");
                break;

            case 'O':
                System.out.println("Vogal O digitada");
                break;

            case 'U':
                System.out.println("Vogal U digitada");
                break;

            default:
                System.out.println("Isso não é uma Vogal.");
                break;
                
            

        }
        teclado.close();
    }
}
