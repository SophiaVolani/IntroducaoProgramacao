import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        char opcao;
        float base, altura, lado, raio;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escolha uma opção: ");
        System.out.println("se opção = T: calcular a área de um triângulo.");
        System.out.println("se opção = Q: calcular a área de um quadrado. ");
        System.out.println("se opção = R: calcular a área de um retângulo.");
        System.out.println("se opção = C: calcular a área de um círculo.");

        opcao = teclado.next().toUpperCase().charAt(0);

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base do triângulo: ");
                base = teclado.nextFloat();
                System.out.println("Digite a altura do triângulo: ");
                altura = teclado.nextFloat();

                float areaTriangulo = (base * altura) / 2f;
                System.out.println("Área do Triângulo = " + areaTriangulo);
                break;

            case 'Q':
                System.out.println("Digite o lado do Quadrado: ");
                lado = teclado.nextFloat();

                float areaQuadrado = lado * lado;
                System.out.println("Área do Quadrado = " + areaQuadrado);
                break;

            case 'R':
                System.out.println("Digite a base do retângulo: ");
                base = teclado.nextFloat();
                System.out.println("Digite a altura do retângulo: ");
                altura = teclado.nextFloat();

                float areaRetangulo = base * altura;
                System.out.println("Área do Retângulo = " + areaRetangulo);
                break;

            case 'C':
                System.out.println("Digite o raio do Circulo: ");
                raio = teclado.nextFloat();

                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.printf("Área do Circulo = %.2f", areaCirculo);
                break;

            default:
                System.out.println("Opção inválida");
        }

        teclado.close();
    }
}