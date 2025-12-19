package e14;

import e1.Pessoa;

public class Casa {
    private int numero;
    private String cor;
    private Pessoa proprietario;

    public Casa(int numero, String cor, Pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }
}
