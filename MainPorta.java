package e12;
public class MainPorta {
    public static void main(String[] args) {
        Porta p = new Porta("Marrom");
        p.abrir();
        System.out.println(p.isAberta());
    }
}
