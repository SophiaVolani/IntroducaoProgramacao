import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "";
        double nota1, nota2;
        while(!nome.equalsIgnoreCase("fim")){
            System.out.println("Digite o nome: ");
            nome = teclado.nextLine();
            if(!nome.equalsIgnoreCase("fim")){
                System.out.println("Digite a nota 1: ");
                nota1 = teclado.nextDouble();

                System.out.println("Digite a nota 2: ");
                nota2 = teclado.nextDouble();


                double media = (nota1 + nota2) / 2;
                System.out.println("A média do(a) " + nome + " é " + media);
            }}
            teclado.close();
            

    }
}
