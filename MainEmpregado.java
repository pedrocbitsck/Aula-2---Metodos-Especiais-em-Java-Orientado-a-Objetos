package e15;
public class MainEmpregado {
    public static void main(String[] args) {
        Empregado e = new Empregado("Marcos", "Analista", 3000);
        System.out.println(e.calcularBonus());
    }
}
