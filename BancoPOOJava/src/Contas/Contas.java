package Contas;

public abstract class Contas {
    private static int SEQUENCIAL = 1; // Variável estática que serve para gerar o número de cada conta corrente criada
    private static int AGENCIA_CONTAS = 0;
    private int agencia;
    private int numero;
    private double saldo;

    public Contas(){
        this.agencia = Contas.AGENCIA_CONTAS;
        this.numero = SEQUENCIAL++;
    }

    public int getAgencia() {
        return agencia;
    }
    
    public int getNumero() {
        return numero;
    }
      
    public double getSaldo() {
        return saldo;
    }
    
    //---Metodos de funcionalidade
    public void sacar(double valor){
        saldo -= valor;
    }
    public void depositar(double valor){
        saldo+=valor;
    }
    public void transferir(double valor, Contas contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void extrato(){
        System.out.println("----------------------------------------");
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Número  da conta: " + this.getNumero());
        System.out.printf("Saldo: %.2f\n",this.getSaldo());
        System.out.println("----------------------------------------");
    }
    
}
