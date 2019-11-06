
public class McMelt implements ReceitaDeHamburguer{

	private Hamburguer hamburguer;
	
	public McMelt() {
		this.hamburguer = new Hamburguer();
	}
	
	@Override
	public void cortaPao() {
		hamburguer.setPao("Pao australiano");
	}

	@Override
	public void preparaMolho() {
		hamburguer.setMolho("Sem molho");
		
	}

	@Override
	public void picaSalada() {
		hamburguer.setMolho("Cebola caramelizada");
		
	}

	@Override
	public void derreteQueijo() {
		hamburguer.setQueijo("Muito cheddar");
	}

	@Override
	public void fritaCarne() {
		hamburguer.setCarne("Carne de minhoca");
	}

	@Override
	public Hamburguer getHamburguer() {
		return hamburguer;
	}


}
