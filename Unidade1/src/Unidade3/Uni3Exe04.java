
package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe04 {
    private float nota1, nota2, nota3;

    public Uni3Exe04(float nota1, float nota2, float nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public float mediaPonderada(){
        return (this.nota1 * 5 + this.nota2 * 3 + this.nota3 * 2) / 10;

    }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota do aluno:");
        float nota1 = teclado.nextFloat();

        System.out.println("Digite a segunda nota do aluno:");
        float nota2 = teclado.nextFloat();

        System.out.println("Digite a terceira nota do aluno:");
        float nota3 = teclado.nextFloat();

        Uni3Exe04 uni3Exe04 = new Uni3Exe04(nota1, nota2, nota3);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("A média ponderada é: " + df.format(uni3Exe04.mediaPonderada()));
        teclado.close();
    }
}
