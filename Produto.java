package e5;
public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void comprar(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        }
    }
}
