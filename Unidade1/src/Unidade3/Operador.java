package Unidade3;

public class Operador {
    public static void main(String[] args) {
        int num1 = 0;
        num1++;
        num1++;
        num1++; //num1 = num1 + 1; ou num1 += 1; (ele mesmo + 1)
        num1--; //num1 = num1 - 1; ou num1 -= 1; (ele mesmo - 1)
        int num2 = 5;
        num1 += num2; //num1 = num1 + num2; (ele mesmo + o valor de num2)
        num1 -= num2; //num1 = num1 - num2; (ele mesmo - o valor de num2)
        num1 *= num2; //num1 = num1 * num2; (ele mesmo * o valor de num2)
        num1 /= num2; //num1 = num1 / num2; (ele mesmo / o valor de num2)
        num1 %= num2; //num1 = num1 % num2; (ele mesmo % o valor de num2) (resto da divisão)
        
        System.out.println(num1);

        String texto = "Aula de Introdução à Programação";
        texto = texto.toUpperCase(); //(ele mesmo em maiúsculo)
        System.out.println(texto);

        texto = texto.toLowerCase(); //(ele mesmo em minúsculo)
        System.out.println(texto);

        String texto1 = "BANANA";
        String texto2 = "banana";

        boolean verdade = false;
        verdade = texto1.equals(texto2); //ou (texto1 == texto2); , compara o conteúdo das strings, e retorna true ou false
        System.out.println(verdade); //false, pois as letras maiúsculas e minúsculas são diferentes

        verdade = (texto1.toUpperCase().equals(texto2.toUpperCase())); //compara o conteúdo das strings, convertendo ambas para maiúsculas, e retorna true ou false
        System.out.println(verdade); //true, pois as letras maiúsculas e minusculas são ignoradas, e o conteúdo das strings é igual
        
        verdade = (texto1.equalsIgnoreCase(texto2)); //compara o conteúdo das strings, ignorando as diferenças entre maiúsculas e minúsculas, e retorna true ou false
        System.out.println(verdade); //true, pois as letras maiúsculas e minusculas são ignoradas, e o conteúdo das strings é igual
        

    }
}
