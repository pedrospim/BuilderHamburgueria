
public class McDonalds {
	public static void main(String[] args) 
    { 
		ReceitaDeHamburguer mcMelt = new McMelt();
		ReceitaDeHamburguer bigMac = new BigMac();
		
		Cozinheiro antonio = new Cozinheiro(mcMelt);
		Cozinheiro frederico = new Cozinheiro(bigMac);
		
		antonio.prepararHamburguer();
		frederico.prepararHamburguer();
    
    }
	
}
