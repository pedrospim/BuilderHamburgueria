
public class Cozinheiro {
	
	private ReceitaDeHamburguer receita;
	
	public Cozinheiro(ReceitaDeHamburguer receita) {
		this.receita = receita;
	}
	
	public Hamburguer getHamburguer() {
		return this.receita.getHamburguer();
	}
	
	public void prepararHamburguer() {
		System.out.println("Cortando pao");
		this.receita.cortaPao();
		System.out.println("Derretendo queijo");
		this.receita.derreteQueijo();
		System.out.println("Picando salada");
		this.receita.picaSalada();
		System.out.println("Preparando molho");
		this.receita.preparaMolho();
		System.out.println("Fritando carne");
		this.receita.fritaCarne();
	}
	

}
