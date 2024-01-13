import java.util.Scanner;
public class ContaNova {
    Scanner input = new Scanner(System.in);
   
    public void criarConta(){
    System.out.println("Informe seu nome e sobrenome");
    String nome = input.next();
    String sobrenome = input.next();
    System.out.println("Informe seu email");
    String email = input.next();
    System.out.println("Digite seu CPF: ");
    int cpf = input.nextInt();
    System.out.println("Obrigado senhor/a "+ nome+ " " + sobrenome + "! Iremos trabalhar para que sua conta seja aberta o mais rápido possível! Verifique seu email diariamente.");
    }   
}
