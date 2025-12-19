package e20;
public class Carro_Acelerar {
    private boolean ligado;

    public Carro_Acelerar() {
        ligado = false;
    }

    public void ligar() {
        ligado = true;
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("O carro está acelerando");
        }
    }
}
