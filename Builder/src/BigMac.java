
public class BigMac implements ReceitaDeHamburguer{

	private Hamburguer hamburguer;
	
	public BigMac() {
		this.hamburguer = new Hamburguer();
		hamburguer.setNome("BigMac");
	}
	
	@Override
	public void cortaPao() {
		hamburguer.setPao("Pao com gergelim");
	}

	@Override
	public void preparaMolho() {
		hamburguer.setMolho("Molho especial");
		
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
		hamburguer.setCarne("Duas carne de minhoca");
	}

	@Override
	public Hamburguer getHamburguer() {
		return hamburguer;
	}


}
