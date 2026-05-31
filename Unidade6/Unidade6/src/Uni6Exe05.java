import java.util.Scanner;

public class Uni6Exe05 {
    private Scanner teclado = new Scanner(System.in);

    private String[] perguntas = new String[]{
        "Gosta de música sertaneja?",
        "Gosta de futebol?",
        "Gosta de seriados?",
        "Gosta de redes sociais?",
        "Gosta da Oktoberfest?"
    };

    private String[] menino = new String[perguntas.length];
    private String[] menina = new String[perguntas.length];

    public void obterRespostasMenino(String[] respostas){

        for(int i=0; i<perguntas.length; i++){

            System.out.println(perguntas[i]);

            System.out.println("Digite SIM ou NAO ou IND");
            menino[i] = teclado.next();
        }
    }

    public void calcularAfinidade(){
        for(int i=0; i<perguntas.length; i++){
            if(menino[i].equals("SIM") && menina[i].equals("SIM"))
                afinidade += 3;
        }


}}
