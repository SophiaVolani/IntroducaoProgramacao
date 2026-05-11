public class Uni5Exe11 {
public static void main(String[] args) {

        long biscQuebradosHora = 1;
        long total = 0;

        for (int hora = 1; hora <= 16; hora++) {

            if (hora == 1) {
                biscQuebradosHora = 1;
            } else if (hora == 2) {
                biscQuebradosHora = 3;
            } else {
                biscQuebradosHora = biscQuebradosHora * 3;
            }

            total = total + biscQuebradosHora;

            System.out.println( hora + " hr: " + biscQuebradosHora + " biscoitos quebrados.");
        }

        System.out.println("\nForam quebrados " + total +" biscoitos ao final do dia. ");
    }
}
