
import java.util.Scanner;
public class CaixaEletronico {
    Scanner scan = new Scanner(System.in);
    double saldo = 350.98;
    public void Saque(){
        System.out.println("Digite o valor que deseja sacar");
        double valorSacado = scan.nextDouble();
        if (valorSacado > saldo) {
            System.out.println("Desculpe, mas você não tem saldo para esse saque!");
        } else {
            double novoSaldo = saldo - valorSacado;
            System.out.println("Seu novo saldo é de: "+novoSaldo);
        }
    }
}
