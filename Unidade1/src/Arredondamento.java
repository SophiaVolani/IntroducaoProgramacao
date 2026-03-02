import java.text.DecimalFormat;

public class Arredondamento {
public static void main(String[] args) {

    float numero = 7.87456f;
    System.out.println("Nota: " + numero);

    DecimalFormat df = new DecimalFormat("0.02");
    System.out.println("Nota: " + df.format(numero));

}
}
