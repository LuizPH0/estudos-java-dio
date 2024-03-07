package ReprodutorMusical;

public class ReprodutorMusical {
    private String musica;

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }
    //Método tocar que recebe a música e retorna uma mensagem de que está sendo reproduzida
    public String tocar(){
        return "Tocando agora: "+this.getMusica();
    }
    //Método parar que recebe a música e retorna uma mensagem de que a música foi interrompida
    public String pausar (){
        return this.getMusica() +" Parou.";
    }
    public String selecionarMusica(){
        return this.getMusica()+" Selecionada";
    }
}
