import java.util.Scanner;

public class Calculadora {
    // preciso pegar dois numeros
    // depois pegar o operador
    // criar os metodos de cada operação
    // apresentar o resultado
    public static void main(String[] args) {
    float numero1, numero2;
    char operador;

    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o número 1:  ");
    numero1 = teclado.nextFloat();
    
    System.out.println("Digite o número 2:  ");
    numero2 = teclado.nextFloat();
    System.out.println("Digite o operador: \n" + "+ para somar \n"+ "- para subtrair \n"+ "* para multiplicar \n"+ "/ para dividir \n"+ "% para pegar o resto da divisão\n");
    operador = teclado.next().charAt(0);
    
    if (operador == '+'){
        somar(numero1, numero2);
    }
    else if (operador == '-'){
        subtrair(numero1, numero2);
    }
    else if (operador == '*'){
        multiplicar(numero1, numero2);
    }
    else if (operador == '/'){
        dividir(numero1, numero2);
    }
    else if (operador == '%'){
        resto(numero1, numero2);
    }
    else{
        System.out.println("Operador Inválido.");
    }

    teclado.close();

    }

    private static void resto(float numero1, float numero2) {
        System.out.println("O resto é "+ (numero1 % numero2));
    }

    private static void dividir(float numero1, float numero2) {
        System.out.println("A divisão é "+ numero1 / numero2);
    }

    private static void multiplicar(float numero1, float numero2) {
        System.out.println("A multiplicação é "+ numero1 * numero2);
    }

    private static void subtrair(float numero1, float numero2) {
        System.out.println("A subtração é "+ (numero1 - numero2));
    }

    private static void somar(float numero1, float numero2) {
        System.out.println("A soma é "+ (numero1 + numero2));

    
    }
}
