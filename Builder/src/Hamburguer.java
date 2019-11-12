public class Hamburguer {

	private String nome;
	private String tipoDePao; 
    private String tipoDeQueijo; 
    private String tipoDeSalada; 
    private String tipoDeMolho;
    private String tipoDeCarne;
	
    
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
	public void setPao(String tipoDePao) {
		this.tipoDePao = tipoDePao;
		
	}

	public void setQueijo(String tipoDeQueijo) {
		this.tipoDeQueijo = tipoDeQueijo;
		
	}

	public void setSalada(String tipoDeSalada) {
		this.tipoDeSalada = tipoDeSalada;
		
	}

	public void setMolho(String tipoDeMolho) {
		this.tipoDeMolho = tipoDeMolho;
		
	}

	public void setCarne(String tipoDeCarne) {
		this.tipoDeCarne = tipoDeCarne;
		
	}

}
