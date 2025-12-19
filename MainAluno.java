package e8;
public class MainAluno {
    public static void main(String[] args) {
        double[] notas = {7, 8, 9};
        Aluno a = new Aluno("Lucas", 1, notas);
        System.out.println(a.calcularMedia());
    }
}
