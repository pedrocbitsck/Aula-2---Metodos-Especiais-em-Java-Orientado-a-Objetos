package e18;
public class MainContaBancaria_Saque {
    public static void main(String[] args) {
        ContaBancaria_Saque c = new ContaBancaria_Saque(500);
        c.sacar(200);
        System.out.println(c.getSaldo());
    }
}
