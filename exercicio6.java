import java.util.Scanner;
import java.util.Locale;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Taxa de serviço (%): ");
        double taxa = teclado.nextDouble();

        System.out.print("Valor Prod 1: ");
        double v1 = teclado.nextDouble();
        System.out.print("Qtd Prod 1: ");
        int q1 = teclado.nextInt();

        System.out.print("Valor Prod 2: ");
        double v2 = teclado.nextDouble();
        System.out.print("Qtd Prod 2: ");
        int q2 = teclado.nextInt();

        // Fórmula: (v1*q1 + v2*q2) * (taxa/100 + 1)
        double total = (v1 * q1 + v2 * q2) * (taxa / 100 + 1);

        System.out.printf("Total com taxa: R$ %.2f\n", total);
        teclado.close();
    }
}
