import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
//Média Final = (Prova 1 * 0.20) + (Prova 2 * 0.30) + (Projeto Final * 0.30) + (Média Aritmética dos Demais Exercícios e Trabalhos Parciais * 0.20)
        float prova1 = 0;

        float prova2 = 0;

        float projetoFinal = 0;

        float exerciciosTrabalhosUnidade1 = 0;
        float exerciciosTrabalhosUnidade2 = 0;
        float exerciciosTrabalhosUnidade3 = 0;
        float exerciciosTrabalhosUnidade4 = 0;
        float exerciciosTrabalhosUnidade5 = 0;
        float exerciciosTrabalhosUnidade6 = 0;
        float exerciciosTrabalhosUnidade7 = 0;


        Scanner teclado = new Scanner(System.in); {
            System.out.println("Digite a nota da prova 1: ");
            prova1 = teclado.nextFloat();

            System.out.println("Digite a nota da prova 2: ");
            prova2 = teclado.nextFloat();

            System.out.println("Digite a nota da projeto final: ");
            projetoFinal = teclado.nextFloat();

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 1: ");
            exerciciosTrabalhosUnidade1 = teclado.nextFloat();  

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 2: ");     
            exerciciosTrabalhosUnidade2 = teclado.nextFloat();

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 3: ");
            exerciciosTrabalhosUnidade3 = teclado.nextFloat();

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 4: ");
            exerciciosTrabalhosUnidade4 = teclado.nextFloat();

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 5: ");
            exerciciosTrabalhosUnidade5 = teclado.nextFloat();

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 6: ");
            exerciciosTrabalhosUnidade6 = teclado.nextFloat();

            System.out.println("Digite a nota dos exercícios e trabalhos parciais da unidade 7: ");
            exerciciosTrabalhosUnidade7 = teclado.nextFloat();
        
            float mediaAritmeticaExerciciosTrabalhos = (exerciciosTrabalhosUnidade1 + exerciciosTrabalhosUnidade2 + exerciciosTrabalhosUnidade3 + exerciciosTrabalhosUnidade4 + exerciciosTrabalhosUnidade5 + exerciciosTrabalhosUnidade6 + exerciciosTrabalhosUnidade7) / 7;
            
            float mediaPonderada = (prova1 * 0.20f) + (prova2 * 0.30f) + (projetoFinal * 0.30f) + (mediaAritmeticaExerciciosTrabalhos * 0.20f);
            System.out.println("A média ponderada é: " + mediaPonderada);

            teclado.close();

                }
            }
        }
    


