
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
//Um aluno está em dúvida sobre o título que vai receber após concluir seu curso de graduação. Considerando que o sistema apresenta 3 cursos disponíveis (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando o título que o aluno vai receber caso opte por aquele curso. As titulações são respectivamente: "Bacharel em Ciência da Computação", "Licenciado em Computação" e "Bacharel em Sistemas de Informação".