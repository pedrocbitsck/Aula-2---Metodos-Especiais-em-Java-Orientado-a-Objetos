package e3;
public class MainCarro {
    public static void main(String[] args) {
        Carro c = new Carro("Fiat", "Uno", 2010);
        c.ligar();
        System.out.println(c.isLigado());
    }
}
