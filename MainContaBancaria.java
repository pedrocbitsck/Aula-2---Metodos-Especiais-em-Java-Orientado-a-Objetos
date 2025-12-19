package e2;
public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123", "Maria", 500);
        conta.depositar(200);
        System.out.println(conta.getSaldo());
    }
}
