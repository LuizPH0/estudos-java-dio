public class SistemaCadastro {
    public static void main(String[] args) throws Exception {
        Pessoa Pessoa = new Pessoa("0765467235", "Luiz Hatem");
        //No exemplo acima foram usados construtores
        Pessoa.setEndereco("Rua Alfredo, 657");
        //No exemplo acima foram  usadas as funções set para definir os atributos endereço da pessoa
        System.out.println("O "+Pessoa.getNome()+" CPF: "+Pessoa.getCpf()+ " mora na rua "+Pessoa.getEndereco());
    }
}
