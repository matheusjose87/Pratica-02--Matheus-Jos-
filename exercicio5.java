import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double valorBase = 40.00;

        System.out.print("Tipo de ingresso (I - Inteira / M - Meia): ");
        String tipo = teclado.next();

        if (tipo.equalsIgnoreCase("M")) {
            System.out.println("Total a pagar: R$ " + (valorBase / 2));
        } else {
            System.out.println("Total a pagar: R$ " + valorBase);
        }

        teclado.close();
    }
}