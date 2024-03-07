package NavegadorInternet;

public class NavegadorInternet {
    private  String site;
    
    public String exibirPagina(){
        return "Exibindo página: "+this.getSite();
    }
    public String adicionarNovaAba(String novaAba){
        return "Adicionando nova aba: "+ novaAba;
    }
    public String atualizarPagina(){
        return "Atualizando a página";
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
}
