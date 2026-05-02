package Pratica06;
class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------");
    }

    public double calcularValorTotalEmEstoque() {
        return preco * quantidade;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {

        Produto p1 = new Produto("Notebook", 2500.0, 10);
        Produto p2 = new Produto("Mouse", 80.0, 50);

        p1.exibirInfo();
        p2.exibirInfo();

        System.out.println("Valor total: " + p1.calcularValorTotalEmEstoque());

        p1.adicionarEstoque(5);

        System.out.println("Após atualizar:");
        p1.exibirInfo();
    }
}
