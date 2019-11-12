
public class Cozinheiro {
	
	private String nome;
	
	private ReceitaDeHamburguer receita;
	
	public Cozinheiro(String nome, ReceitaDeHamburguer receita) {
		this.nome = nome;
		this.receita = receita;
	}
	
	public Hamburguer getHamburguer() {
		return this.receita.getHamburguer();
	}
	
	
	public void prepararHamburguer() {
		System.out.println(nome +": Cortando pao do " + getHamburguer().getNome());
		this.receita.cortaPao();
		
		System.out.println(nome +": Derretendo queijo do " + getHamburguer().getNome());
		this.receita.derreteQueijo();
		
		System.out.println(nome +": Picando salada do " + getHamburguer().getNome());
		this.receita.picaSalada();
		
		System.out.println(nome +": Preparando molho do " + getHamburguer().getNome());
		this.receita.preparaMolho();
		
		System.out.println(nome +": Fritando carne do " + getHamburguer().getNome());
		this.receita.fritaCarne();
	}
	

}
