package e16;
public class Aviao {
    private String modelo;
    private int capacidadePassageiros;
    private double velocidadeMaxima;

    public Aviao(String modelo, int capacidadePassageiros, double velocidadeMaxima) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public String getModelo() {
        return modelo;
    }
}
