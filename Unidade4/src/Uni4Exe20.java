import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        float p1, p2, p3, exe, media;
        String conceito, situacao;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a nota da prova 1: ");
        p1 = teclado.nextFloat();

        System.out.println("Digite a nota da prova 2: ");
        p2 = teclado.nextFloat();

        System.out.println("Digite a nota da prova 3: ");
        p3 = teclado.nextFloat();

        System.out.println("Digite a nota dos exercícios: ");
        exe = teclado.nextFloat();

        media = (p1 + (2 * p2) + (3 * p3) + exe) / 7;

        if (media >= 9.0){
            conceito = "A";
        }
        else if (media >= 7.5){
            conceito = "B";
        }
        else if (media >= 6.0){
            conceito = "C";
        }
        else if (media >= 4.0){
            conceito = "D";
        }
        else{
            conceito = "E";
        }

        if (conceito =="A" || conceito =="B" || conceito =="C"){
            situacao = "Aprovado";
        }
        else{
            situacao = "Reprovado";
        }

        System.out.printf("A média de aproveitamento foi: %.2f. ", media); 
        //%.2f é = DecimalFormat, só que em menos linhas.
        System.out.println("Conceito: " + conceito + ". " + situacao);

        teclado.close();
    }
}
//Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcule a média de aproveitamento e o conceito do aluno, usando a fórmula:
// atribuição dos conceitos obedece à tabela abaixo:

//media	conceito
//>= 9.0	A
//>= 7.5 e < 9.0	B
//>= 6.0 e < 7.5	C
//>= 4.0 e < 6.0	D
//< 4.0	E
//O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito seja A, B ou C, e "reprovado" caso o conceito seja D ou E.
