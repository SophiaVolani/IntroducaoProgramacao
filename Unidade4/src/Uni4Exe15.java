import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        int mes;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a quantidade de meses em que você foi admitido: ");
        mes = teclado.nextInt();

        if (mes >= 1 && mes < 13){
            System.out.println("O funcionário irá receber 5% de reajuste.");
        }
        else if(mes >=13 && mes < 49 ){
            System.out.println("O funcionário irá receber 7% de reajuste.");
        }
        else {
            System.out.println("Reajuste não informado.");
        }
        teclado.close();
    }
}
