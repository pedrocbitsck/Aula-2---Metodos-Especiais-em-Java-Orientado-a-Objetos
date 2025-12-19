package e12;
public class Porta {
    private boolean aberta;
    private String cor;

    public Porta(String cor) {
        this.cor = cor;
        this.aberta = false;
    }

    public boolean isAberta() {
        return aberta;
    }

    public void abrir() {
        aberta = true;
    }

    public void fechar() {
        aberta = false;
    }
}
