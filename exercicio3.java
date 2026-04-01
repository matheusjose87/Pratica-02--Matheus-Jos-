import java.util.Scanner;
import java.util.Locale;

public class exercicio3 {
    public static void main(String[] args) {
        // Locale.US serve para aceitar ponto (8.50) em vez de vírgula no terminal
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Valor unitário: ");
        double preco = teclado.nextDouble();
        System.out.print("Quantidade: ");
        int qtd = teclado.nextInt();

        double total = preco * qtd;

        if (total > 100.00) {
            total = total * 0.92; // Aplica 8% de desconto direto
            System.out.println("Desconto aplicado!");
        }

        System.out.printf("Valor total: R$ %.2f\n", total);
        teclado.close();
    }
}