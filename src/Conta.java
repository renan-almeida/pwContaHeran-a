public class Conta {
    protected double saldo = 3000.00;

    public String consultarSaldo() {
        return (saldo + "R$");
    }

    public String creditar(double valor) {
        saldo = saldo + valor;
        return consultarSaldo();
    }

    public String debitar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return consultarSaldo();
        }
        else {
            System.out.println("Não há saldo suficiente!");
            return (consultarSaldo());
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
