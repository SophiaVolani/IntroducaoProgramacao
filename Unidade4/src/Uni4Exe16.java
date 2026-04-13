import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        int homem1, homem2, mulher1, mulher2;
        int homemVelho, homemNovo, mulherVelha, mulherNova;
        int soma, produto;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a idade do primeiro homem: ");
        homem1 = teclado.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        homem2 = teclado.nextInt();

        System.out.println("Digite a idade da primeira mulher: ");
        mulher1 = teclado.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        mulher2 = teclado.nextInt();

        if(homem1 > homem2){
         homemVelho = homem1;
         homemNovo = homem2;    
        }
        else{
            homemVelho = homem2;
            homemNovo = homem1;
        }

        if(mulher1 > mulher2){
            mulherVelha = mulher1;
            mulherNova = mulher2;
        }
        else{
            mulherVelha = mulher2;
            mulherNova = mulher1;
        }

        soma = homemVelho + mulherNova;
        produto = homemNovo * mulherVelha;


        
        System.out.println("Soma: "+ soma + " Produto: " + produto);

        teclado.close();

    }
}
