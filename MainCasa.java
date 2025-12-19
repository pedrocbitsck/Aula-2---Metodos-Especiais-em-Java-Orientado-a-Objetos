package e14;

import e1.Pessoa;

public class MainCasa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("Carlos", 30, 1.80);
        Casa c = new Casa(10, "Azul", p);
        System.out.println(c.getProprietario().getNome());
    }
}
