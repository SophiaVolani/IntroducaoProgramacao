public class Familia {
    public static void main(String[] args) {
        float idadeM = 40, idadeZ = 30, idadeL = 20;

        if (idadeM < idadeZ && idadeM < idadeL){
            System.out.println("Marquinhos é caçula.");
        }

        else if (idadeZ < idadeL) {
            System.out.println("Zezinho é caçula.");
        }

        else{
        System.out.println("Luluzinha é caçula.");
        }
    }
}
