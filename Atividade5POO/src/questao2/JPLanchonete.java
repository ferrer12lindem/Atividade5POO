package questao2;

public class JPLanchonete extends Lanchonete{

	public Sanduiche criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){

		sanduichesIngredientes = new SanduichesIngredientFactoryJP(); 
		Sanduiche sanduiche = new SanduicheJP(sanduichesIngredientes);
	    return sanduiche;
	}
}
