package e19;
public class Pessoa_toString {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa_toString(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Altura: " + altura;
    }
}
