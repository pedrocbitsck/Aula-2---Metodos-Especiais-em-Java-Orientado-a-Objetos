package e1;
public class MainPessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", 18, 1.75);
        System.out.println(p.getNome());
        System.out.println(p.getIdade());
        System.out.println(p.getAltura());
    }
}
