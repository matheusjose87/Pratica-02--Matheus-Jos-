import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        System.out.println("Dobro: " + (n * 2));
        System.out.println("Triplo: " + (n * 3));

        teclado.close();
    }
}