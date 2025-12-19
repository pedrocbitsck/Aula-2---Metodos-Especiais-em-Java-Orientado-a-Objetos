package e18;
public class ContaBancaria_Saque {
    private double saldo;

    public ContaBancaria_Saque(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
