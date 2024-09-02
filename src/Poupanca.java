public class Poupanca extends Conta {
    private double reajusteMensal;

    public void atualizarSaldo() {
        saldo = saldo + reajusteMensal;

    }
}
