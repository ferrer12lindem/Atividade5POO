package questao2;

public abstract class Lanchonete {

	protected String nome;
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	protected SanduichesIngredientFactory sanduichesIngredientes;
	
	public SanduichesIngredientFactory orderSanduiche(SanduichesIngredientFactory sanduichesIngredientes){
		sanduichesIngredientes = criarSanduiche(sanduichesIngredientes);
		Sanduiche sanduiche = new Sanduiche();
		System.out.println("Preparando...");
		sanduiche.descricao();
		sanduiche.box();
		return sanduichesIngredientes;
	}
	
	public abstract SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes);
}
