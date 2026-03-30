package Unidade3;
import java.util.Scanner;

//Cria a classe CalculadoraV2, com os atributos num1 e num2,
//construtor para inicializar os atributos, 
//e os métodos somar e dividir para realizar as operações matemáticas.
public class CalculadoraV2 { 
    private double num1;
    private double num2;

    //Construtor da classe, para receber os atributos(variáveis) num1 e num2, e inicializá-los
    public CalculadoraV2(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double somar(){
        return num1 + num2;
    }
    public double dividir(){
        return num1 / num2;
    }

    //psvm vem depois do construtor para utilizar os atributos e métodos da classe CalculadoraV2
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = teclado.nextDouble();

        System.out.println("Digite o segundo número: "); 
        double n2 = teclado.nextDouble();

        //instanciando a classe CalculadoraV2, passando os valores dos números para o construtor
        CalculadoraV2 calc = new CalculadoraV2(n1, n2);

        //chamando os métodos somar e dividir, e imprimindo os resultados
        double resultado = calc.somar();
        System.out.println("Soma: " + resultado);


        resultado = calc.dividir();
        System.out.println("Divisão: " + resultado);

        teclado.close();


    }
}
