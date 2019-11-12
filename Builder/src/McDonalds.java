
public class McDonalds {
	public static void main(String[] args) 
    { 
		ReceitaDeHamburguer mcMelt = new McMelt();
		ReceitaDeHamburguer bigMac = new BigMac();
		
		Cozinheiro antonio = new Cozinheiro("antonio", bigMac);
		
		antonio.prepararHamburguer();
		
		Cozinheiro betania = new Cozinheiro("Betania", mcMelt);
		
		betania.prepararHamburguer();
		
		Hamburguer meuLanche = betania.getHamburguer();
    
    }
	
}
