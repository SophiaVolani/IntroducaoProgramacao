import java.util.Scanner;

public class Uni4exe19 {
    public static void main(String[] args) {
        int x, y;

        Scanner teclado = new Scanner(System.in);

        System.out.print("X: ");
        x = teclado.nextInt();

        System.out.print("Y: ");
        y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } 
        else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } 
        else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } 
        else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } 
        else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        }

        teclado.close();
    }
}
