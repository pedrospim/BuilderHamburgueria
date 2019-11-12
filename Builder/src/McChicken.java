
public class McChicken implements ReceitaDeHamburguer{

	private Hamburguer hamburguer;
	
	public McChicken() {
		this.hamburguer = new Hamburguer();
		hamburguer.setNome("McChicken");
	}
	
	@Override
	public void cortaPao() {
		hamburguer.setPao("Pao normal");
	}

	@Override
	public void preparaMolho() {
		hamburguer.setMolho("Maionese");
		
	}

	@Override
	public void picaSalada() {
		hamburguer.setMolho("Alface");
		
	}

	@Override
	public void derreteQueijo() {
		hamburguer.setQueijo("Queijo prato");
	}

	@Override
	public void fritaCarne() {
		hamburguer.setCarne("Carne de pintinho");
	}

	@Override
	public Hamburguer getHamburguer() {
		return hamburguer;
	}


}
