import java.util.Scanner;

public class Uni4Exe07 {
        public static void main(String[] args) {
            float qntAdicional;
            float pesoExcedido;
            float peso;
            float valorPagar = 0f;

            Scanner teclado = new Scanner(System.in);
            System.out.println("Escreva o peso da carta: ");
            peso = teclado.nextFloat();

            if(peso <= 50){
                valorPagar = 0.45f;
                System.out.println("O Custo do selo é de R$" + valorPagar);
            }
            else{
                pesoExcedido = peso - 50;
                qntAdicional = (pesoExcedido / 20) + 1;
                valorPagar = 0.45f + 0.45f * qntAdicional;
                System.out.println("O Custo do selo é de R$" + valorPagar);
            }
            teclado.close();


        }
}
