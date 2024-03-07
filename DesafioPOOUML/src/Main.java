import iPhone.iphone;
import ReprodutorMusical.ReprodutorMusical;
import AparelhoTelefonico.AparelhoTelefonico;
import NavegadorInternet.NavegadorInternet;
public class Main {
    public static void main(String[] args) throws Exception {
        iphone  iphone = new iphone();
        ReprodutorMusical musica = new ReprodutorMusical();
        AparelhoTelefonico telefone = new AparelhoTelefonico();
        NavegadorInternet navegador = new NavegadorInternet();
        //Classe iphone
        iphone.ligar();
        iphone.desligar();
        //Classe Reprodutor  Musical
        System.out.println("--------------------------");
        musica.setMusica("Maybach");
        System.out.println(musica.tocar()); 
        System.out.println(musica.pausar());
        System.out.println(musica.selecionarMusica());
        //Classe AparelhoTelefonico
        System.out.println("--------------------------");
        telefone.setNumeroLigado(8748882);
        System.out.println(telefone.ligar());
        telefone.setNumeroAtendido(8199034);
        System.out.println(telefone.atender());
        System.out.println(telefone.iniciarCorreioVoz());
        //Classe NavegadorInternet
        System.out.println("--------------------------");
        navegador.setSite("Google");
        System.out.println(navegador.exibirPagina());
        System.out.println(navegador.adicionarNovaAba("Facebook"));
        System.out.println(navegador.atualizarPagina());
    }
}
