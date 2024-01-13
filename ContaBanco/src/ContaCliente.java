import java.util.Scanner;
public class ContaCliente {
    Scanner input = new Scanner(System.in);
    double saldoBanco = 429.23;

           public void ClienteBanco(){ 
            System.out.println("Digite o número da Agência");
            String agenciaCliente = input.nextLine();


            System.out.println("Agora digite o número da conta: ");
            int numeroConta = input.nextInt(); // Para ler o Número da Conta

            
            System.out.println("Por favor digite seu nome completo para confirmação de dados");
            String nomeCliente = input.next();

            System.out.println(" Olá senhor "+ nomeCliente + ", o seu saldo é de " + saldoBanco);
            
}
}
