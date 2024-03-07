package AparelhoTelefonico;

public class AparelhoTelefonico {
    private int numeroLigado;
    private int numeroAtendido;

    public String ligar() { 
        return "Estou ligando para o telefone: "+this.getNumeroLigado();
    }
    public String atender(){
        return  "Estou atendendo o número "+this.getNumeroAtendido();
    }
    public String iniciarCorreioVoz(){
        return  "Iniciando correio de voz...";
    }

    public int getNumeroLigado() {
        return numeroLigado;
    }
    public void setNumeroLigado(int numeroLigado) {
        this.numeroLigado = numeroLigado;
    }
    
    public int getNumeroAtendido() {
        return numeroAtendido;
    }
    public void setNumeroAtendido(int numeroAtendido) {
        this.numeroAtendido = numeroAtendido;
    }
    
}
