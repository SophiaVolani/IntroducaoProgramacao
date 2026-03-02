public class Media {
    public static void main(String[] args) {

        float media = 0;
        
        float nota1 = 7.5f;
        float nota2 = 8;
        float nota3 = 9;
        float divisor = 3;

        media = (nota1 + nota2 + nota3) / divisor;
        System.out.println("A média é:" + media);

        


    }}
// float é um tipo de variável -> recebe um número quebrado (com poucas casas decimais)
// double é um tipo de variável -> recebe um número quebrado (com casas decimais)
// f no final do número -> indica que é um float (número quebrado) e não um double (número quebrado com mais casas decimais)
//quando float -> Ex: float nota1 = 7.5f; -> o f indica que é um float
//quando double -> Ex: double nota1 = 7.5; -> não precisa do f, pois o padrão é double