

public class SistemaIBGE {
    public static void main(String[] args) throws Exception {
        
       for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
        System.out.println(e.getSigla() + " - "+ e.getNomeMaiusculo());
       }

       EstadoBrasileiro estadoSelecionado = EstadoBrasileiro.PERNAMBUCO; //Para testar o código, escolha um estado que você
       
       

       

       System.out.println("O estado selecionado foi: "+ estadoSelecionado.getNomeMaiusculo() + " - "+estadoSelecionado.getSigla());
    
    }
}
