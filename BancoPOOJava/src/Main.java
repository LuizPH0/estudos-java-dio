import ContaCorrente.ContaCorrente;
import ContaPoupanca.ContaPoupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp  = new ContaPoupanca();
        cc.depositar(430.89);
        cc.sacar(100.0);
        cp.depositar(2900.90);
        cp.transferir(200.0, cc);
        
        cp.extrato();
        cc.extrato();
    }
}
