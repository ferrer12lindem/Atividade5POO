package questao2;

public class CGLanchonete extends Lanchonete{

	public CGLanchonete(){
		super.nome = "SanduicheCG";
	}
	
	public SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){

		sanduichesIngredientes = new SanduichesIngredientFactoryCG(); 

		System.out.println("Ingredientes "+nome+"...");
		System.out.println(sanduichesIngredientes.createPao().descricao());
		System.out.println(sanduichesIngredientes.createQueijo().descricao());
		System.out.println(sanduichesIngredientes.createPresunto().descricao());
		System.out.println(sanduichesIngredientes.createSalada().descricao());
		return sanduichesIngredientes;
	}
}
