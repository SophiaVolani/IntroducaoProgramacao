import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        float altura, massa, imc;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Altura: ");
        altura = teclado.nextFloat();

        System.out.print("Massa: ");
        massa = teclado.nextFloat();

        imc = massa / (altura * altura);

        if (imc < 18.5){
            System.out.println("Magreza");
        } 
        else if (imc < 25){
            System.out.println("Saudável");
        } 
        else if (imc < 30){
            System.out.println("Sobrepeso");
        } 
        else if (imc < 35){
            System.out.println("Obesidade Grau I");
        } 
        else if (imc < 40){
            System.out.println("Obesidade Grau II (severa)");
        } 
        else{
            System.out.println("Obesidade Grau III (mórbida)");
        }

        teclado.close();
    }
}

//O índice de massa corporal (IMC) é uma medida internacional usada para calcular se uma pessoa está no peso ideal. O IMC é determinado pela divisão da massa do indivíduo pelo quadrado de sua altura, onde a massa está em quilogramas e a altura está em metros, de acordo com a fórmula:

//\normalsize&space;IMC=\frac{Massa}{Altura^2}

//Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do indivíduo, de acordo com a seguinte tabela:

//IMC	Classificação
//< 18.5	Magreza
//18.5 - 24.9	Saudável
//25.0 - 29.9	Sobrepeso
//30.0 - 34.9	Obesidade Grau I
//35.0 - 39.9	Obesidade Grau II (severa)
//>= 40.0	Obesidade Grau III (mórbida)
//Exemplos de entrada	Exemplos de saída
//Altura: 1.75 Massa: 50	Magreza
//Altura: 1.8 Massa: 70	Saudável
//Altura: 1.65 Massa: 85	Obesidade Grau I
//Altura: 1.75 Massa: 120	Obesidade Grau II (severa)