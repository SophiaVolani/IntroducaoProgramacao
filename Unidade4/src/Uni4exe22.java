
import java.util.Scanner;

public class Uni4exe22 {
    public static void main(String[] args) {
        int opcao;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite 1 para Ciência da Computação, 2 para Licenciatura da Computação ou 3 para Sistemas de Informação para ver qual será sua titulação: ");
        opcao = teclado.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Opção inválida, tente novamente.");
        }
        teclado.close();
    }
}