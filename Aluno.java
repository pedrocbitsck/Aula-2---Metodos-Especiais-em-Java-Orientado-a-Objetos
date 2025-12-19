package e8;
public class Aluno {
    private String nome;
    private int matricula;
    private double[] notas;

    public Aluno(String nome, int matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }
}
