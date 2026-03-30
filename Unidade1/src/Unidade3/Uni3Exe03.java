package Unidade3;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni3Exe03 {
    private float valorLitroGasolina = 5.75f;
    private float valorPagamento;

    public Uni3Exe03 (float valorLitroGasolina, float valorPagamento){
        this.valorLitroGasolina = valorLitroGasolina;
        this.valorPagamento = valorPagamento;
    }

    public float calcularQuantidadeLitros(){
        return this.valorPagamento / this.valorLitroGasolina;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite quanto você deseja pagar pela gasolina:");
        float valorPagamento = teclado.nextFloat();

        Uni3Exe03 uni3Exe03 = new Uni3Exe03(5.75f, valorPagamento);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Você abasteceu " + df.format(uni3Exe03.calcularQuantidadeLitros()) + " litros de gasolina.");
        teclado.close();

    }
}
