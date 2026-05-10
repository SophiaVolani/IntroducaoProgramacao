import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        int idade1, idade2, idade3;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira idade: ");
        idade1 = teclado.nextInt();

        System.out.println("Digite a segunda idade: ");
        idade2 = teclado.nextInt();

        System.out.println("Digite a terceira idade: ");
        idade3 = teclado.nextInt();

        if((idade1 == idade2 && idade1 != idade3) || (idade1 == idade3 && idade1 != idade2 ) || (idade3 == idade2 && idade3 != idade1)){
            System.out.println("Os irmãos são GÊMEOS !");
        }
        else if(idade1 == idade2 && idade1 == idade3){
            System.out.println("Os irmãos são TRIGÊMEOS !");
        }
        else{
            System.out.println("São apenas irmãos.");
        }
        teclado.close();
    }
}
//Escreva um algoritmo para ler a idade de 3 irmãos, escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, e apenas irmãos se todas as idades forem diferentes.