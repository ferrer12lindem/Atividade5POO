package questao2;

public class RTLanchonete extends Lanchonete{ 
	
	public Sanduiche criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){

		sanduichesIngredientes = new SanduichesIngredientFactoryRT();	
		Sanduiche sanduiche = new SanduicheRT(sanduichesIngredientes);
	    return sanduiche;
	}
}
