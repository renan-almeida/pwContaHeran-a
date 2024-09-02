import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Este é seu saldo: \n");
        System.out.println(conta.consultarSaldo());
        System.out.println("----------------------------------");
        System.out.println("Digite o valor que deseja creditar: ");
        double valor = leitura.nextDouble();
        conta.creditar(valor);







    }
}