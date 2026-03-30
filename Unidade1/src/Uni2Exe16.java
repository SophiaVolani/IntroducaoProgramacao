
import java.util.Scanner;
public class Uni2Exe16 {
    public static void main(String[] args) {
        int qntLata350ml, qntGarrafa600ml, qntGarrafa2l;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade de latas de 350ml que você quer comprar: ");
        qntLata350ml = teclado.nextInt();

        System.out.println("Digite a quantidade de garrafas de 600ml que você quer comprar: ");
        qntGarrafa600ml = teclado.nextInt();

        System.out.println("Digite a quantidade de garrafas de 2 litros que você quer comprar: ");
        qntGarrafa2l = teclado.nextInt();    


        float TotalLitros = (qntLata350ml * 0.35f) + (qntGarrafa600ml * 0.6f) + (qntGarrafa2l * 2f);

        System.out.println("O comerciante comprou " + TotalLitros + " litros de refrigerante.");
        teclado.close();

    }
}
