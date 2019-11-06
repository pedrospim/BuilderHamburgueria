
//public interface Hamburguer {
//
//	public void setPao(String tipoDePao);
//	
//	public void setQueijo(String tipoDeQueijo);
//	
//	public void setSalada(String tipoDeSalada);
//	
//	public void setMolho(String tipoDeMolho);
//	
//	public void setCarne(String tipoDeCarne);
//	
//}


public class Hamburguer {

	private String tipoDePao; 
    private String tipoDeQueijo; 
    private String tipoDeSalada; 
    private String tipoDeMolho;
    private String tipoDeCarne;
	
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
