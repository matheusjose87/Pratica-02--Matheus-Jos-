import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        // length() retorna a quantidade total de caracteres
        int tamanho = palavra.length();
        System.out.println("A palavra '" + palavra + "' possui " + tamanho + " caracteres.");

        scanner.close();
    }
}
