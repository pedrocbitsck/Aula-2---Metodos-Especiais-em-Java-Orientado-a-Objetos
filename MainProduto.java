package e5;
public class MainProduto {
    public static void main(String[] args) {
        Produto p = new Produto("Mouse", 50, 10);
        p.comprar(3);
        System.out.println(p.getQuantidadeEmEstoque());
    }
}
