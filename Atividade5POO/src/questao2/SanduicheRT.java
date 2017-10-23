package questao2;

public class SanduicheRT extends Sanduiche{

protected SanduichesIngredientFactory ingredientFactory;
	
	public SanduicheRT(SanduichesIngredientFactory ingredientFactory){
		this.ingredientFactory = ingredientFactory;
		super.nome = "SanduicheRT";
	}

	@Override
	public void preparar() {
		System.out.println("Preparando "+nome+"...");
		System.out.println(ingredientFactory.createPao().descricao());
		System.out.println(ingredientFactory.createQueijo().descricao());
		System.out.println(ingredientFactory.createPresunto().descricao());
		System.out.println(ingredientFactory.createSalada().descricao());
	}
}
