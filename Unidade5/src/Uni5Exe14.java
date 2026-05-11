import java.util.Scanner;

    public class Uni5Exe14 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nome;

        double pc;
        double pv;
        double lucro;

        double totalCompra = 0;
        double totalVenda = 0;
        int lucroMenor10 = 0;
        int lucro10e20 = 0;
        int lucroMaior20 = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println("Mercadoria " + i);

            System.out.print("Nome: ");
            nome = teclado.next();

            System.out.print("Preço de compra: ");
            pc = teclado.nextDouble();

            System.out.print("Preço de venda: ");
            pv = teclado.nextDouble();

            lucro = ((pv - pc) / pc) * 100;

            if (lucro < 10) {
                lucroMenor10++;
            } else if (lucro <= 20) {
                lucro10e20++;
            } else {
                lucroMaior20++;
            }

            totalCompra += pc;
            totalVenda += pv;
        }

        double lucroTotal = totalVenda - totalCompra;

        System.out.println("\nLucro menor que 10%: " + lucroMenor10);

        System.out.println("Lucro entre 10% e 20%: " + lucro10e20);

        System.out.println("Lucro maior que 20%: " + lucroMaior20);

        System.out.println("Valor total de compra: " + totalCompra);

        System.out.println("Valor total de venda: " + totalVenda);

        System.out.println("Lucro total: " + lucroTotal);

        teclado.close();
        }
    }

