import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Olá, bem vindo ao Banco do Luiz! Como posso te ajudar?");
        System.out.println("1. Já tenho conta");
        System.out.println("2. Crie uma nova conta");
        System.out.println("3. Sair");
        int opcaoBanco = input.nextInt();

        if (opcaoBanco == 1) {
            ContaCliente contaCliente = new ContaCliente();
            contaCliente.ClienteBanco();
        }else if (opcaoBanco == 2) {
            ContaNova contaNova = new ContaNova();
            contaNova.criarConta();

        }else if (opcaoBanco == 3) {
            System.out.println("Tudo bem, obrigado! E volte logo! :)");
        }
    }
}
