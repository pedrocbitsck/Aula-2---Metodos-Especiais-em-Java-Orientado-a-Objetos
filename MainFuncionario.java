package e9;
public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("Ana", 2000, "TI");
        f.aumentarSalario(10);
        System.out.println(f.getSalario());
    }
}
