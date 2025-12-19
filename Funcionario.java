package e9;
public class Funcionario {
    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentarSalario(double percentual) {
        salario += salario * (percentual / 100);
    }
}
