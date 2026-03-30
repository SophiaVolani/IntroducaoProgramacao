package Unidade3;

public class Calculadora {
    int numero1, numero2, resultado;

    public Calculadora(){
        numero1 = 4;
        numero2 = 5;

        //jeito 1. Chamar o método somar dentro da variável resultado e imprimir o resultado
        resultado = somar();
        System.out.println("O resultado da soma é: " + resultado);

        //jeito 2. Chamar o método somaDoisValores com parâmetros dentro da variável resultado
        //e imprimir o resultado
        resultado = somaDoisValores(numero1, numero2);
        System.out.println("O resultado da soma é: " + resultado);

        //jeito 3. Chamar o método somaValores com void, e imprimir o resultado
        somaValores();
        System.out.println("O resultado da soma é: " + resultado);

    }

    public int somar(){
        return numero1 + numero2;
    }

    public int somaDoisValores(int num1, int num2){
        return num1 + num2;
    }

    public void somaValores(){
        resultado = numero1 + numero2;
    }
    
    
    public static void main(String[] args) {
        new Calculadora();
            
    }
}
