public enum EstadoBrasileiro {
    PERNAMBUCO ("PE", "Pernambuco"), 
    AMAZONAS("AM", "Amazonas"),  
    MINAS_GERAIS("MG", "Minas Gerais"), 
    RIO_JANEIRO( "RJ", "Rio de Janeiro");
    
    private String sigla;
    
    private String nome;
   

    EstadoBrasileiro(String sigla, String nome) { 
        this.sigla = sigla; this.nome = nome;
    
    }
    
    
    public String getSigla() {
        return sigla;
    }
    public void setSigla(String sigla) {
        this.sigla = sigla;
    } 
    
    
    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
    
    
   
}
