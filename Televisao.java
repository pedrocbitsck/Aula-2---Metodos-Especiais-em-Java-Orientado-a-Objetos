package e11;
public class Televisao {
    private int volume;
    private int canal;

    public Televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void diminuirVolume() {
        volume--;
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }
}
