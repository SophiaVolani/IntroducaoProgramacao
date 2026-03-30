public class App {
    public static void main(String[] args){
        float media = 6f;
        float frequencia = 75f;
        
        if (media >= 6 && frequencia >= 75){
            System.out.println("Aprovado!");
        }
        else{
            System.out.println("Reprovado. :(");
        }

        String fruta = "Banana";

        if (fruta != "Banana") {
            System.out.println("outra fruta");
        }
        else{
            System.out.println("Bom pra vida");
        }


        float nota1 = 7;
    float nota2 = 6;

    media = (nota1 + nota2) / 2;
    frequencia = 75;

    boolean provaSuficiencia = true;
    if (media >= 6 || provaSuficiencia) {
        System.out.println("Aprovado!");
    }
    else {
        System.out.println("Reprovado. :((");
    }
    }
}

