//Uma fábrica de refrigerantes vende seu produto em três formatos: lata de 350 ml, garrafa de 600 ml 
//e garrafa de 2 litros. Se um comerciante compra uma determinada quantidade de cada formato, 
//faça um programa para calcular quantos litros de refrigerante ele comprou.
package Unidade3;

import java.util.Scanner;
import java.text.DecimalFormat;


public class Uni3Exe07 {
    private int lata350; 
    private int garrafa600;
    private int garrafa2;
    

    public Uni3Exe07(int lata350, int garrafa600, int garrafa2){
        this.lata350 = lata350;
        this.garrafa600 = garrafa600;
        this.garrafa2 = garrafa2;
    }

    public float calcularLata(){
        return (lata350 * 0.35f);
    }

    public float calcularGarrafa600(){
        return (garrafa600 * 0.60f);
    }

    public float calcularGarrafa2(){
        return (garrafa2 * 2.0f);
    }

    public float calcularTotalLitros(){
        return (calcularLata() + calcularGarrafa600() + calcularGarrafa2());
    }

    public static void main(String[] args) {
        System.out.println("Digite quantas latas de 350ml você deseja comprar: ");
        Scanner teclado = new Scanner(System.in);
        int lata350 = teclado.nextInt();

        System.out.println("Digite quantas garrafas de 600ml você deseja comprar: ");
        int garrafa600 = teclado.nextInt();

        System.out.println("Digite quantas garrafas de 2 litros você deseja comprar: ");
        int garrafa2 = teclado.nextInt();

        DecimalFormat df = new DecimalFormat("0.00");

        Uni3Exe07 uni3Exe07 = new Uni3Exe07(lata350, garrafa600, garrafa2);

        System.out.println("Ao total você comprou " +df.format(uni3Exe07.calcularTotalLitros()) + " litros.");
    
        teclado.close();
    }
}
