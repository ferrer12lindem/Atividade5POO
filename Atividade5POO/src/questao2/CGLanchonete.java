package questao2;

public class CGLanchonete extends Lanchonete{

	public Sanduiche criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){

		sanduichesIngredientes = new SanduichesIngredientFactoryCG(); 
		Sanduiche sanduiche = new SanduicheCG(sanduichesIngredientes);
		return sanduiche;
	}
}
