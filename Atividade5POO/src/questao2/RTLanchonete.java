package questao2;

public class RTLanchonete extends Lanchonete{ 
	
	public RTLanchonete(){
		super.nome = "SanduicheRT";
	}
	
	public SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){

		sanduichesIngredientes = new SanduichesIngredientFactoryRT();	
		
		System.out.println("Ingredientes "+nome+"...");
		System.out.println(sanduichesIngredientes.createPao().descricao());
		System.out.println(sanduichesIngredientes.createQueijo().descricao());
		System.out.println(sanduichesIngredientes.createPresunto().descricao());
		System.out.println(sanduichesIngredientes.createSalada().descricao());
		return sanduichesIngredientes;
	}
}
