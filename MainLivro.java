package e4;
public class MainLivro {
    public static void main(String[] args) {
        Livro l = new Livro("Java", "Autor", 2024);
        l.emprestar();
        System.out.println(l.isDisponivel());
    }
}
