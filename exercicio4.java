import java.util.Scanner;
import java.util.Locale;

public class exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Preço do litro: ");
        double precoLitro = teclado.nextDouble();
        System.out.print("Valor disponível: ");
        double meuDinheiro = teclado.nextDouble();

        double litros = meuDinheiro / precoLitro;

        System.out.printf("Você comprará: %.2f litros\n", litros);
        teclado.close();
    }
}