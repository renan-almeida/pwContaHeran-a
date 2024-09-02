public class Corrente extends Conta {
    private double limite;

    public String debitar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            return consultarSaldo();
        }
        else if (valor + limite <= saldo) {
            saldo = saldo - valor;
            atualizarSaldo();
            System.out.println("Saldo insuficiente, mesmo com uso do limite especial!");
            return consultarSaldo();

        }
        else {
            System.out.println("Saldo insuficiente! \n" );
            return consultarSaldo();
        }
    }

    public void atualizarSaldo() {
        if (saldo < 0) {

        }
    }

}
