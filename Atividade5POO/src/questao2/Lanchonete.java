package questao2;

public abstract class Lanchonete {

	public Sanduiche orderSanduiche(SanduichesIngredientFactory sanduichesIngredientes){
		Sanduiche sanduiche = criarSanduiche(sanduichesIngredientes);
		sanduiche.preparar();
		sanduiche.descricao();
		sanduiche.box();
		return sanduiche;
	}
	
	public abstract Sanduiche criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes);
}
