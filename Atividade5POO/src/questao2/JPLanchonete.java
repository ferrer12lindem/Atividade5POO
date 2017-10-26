package questao2;

public class JPLanchonete extends Lanchonete{
	
	public JPLanchonete(){
		super.nome = "SanduicheJP";
	}

	public SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){
		
		sanduichesIngredientes = new SanduichesIngredientFactoryJP(); 
		
		System.out.println("Ingredientes "+nome+"...");
		System.out.println(sanduichesIngredientes.createPao().descricao());
		System.out.println(sanduichesIngredientes.createQueijo().descricao());
		System.out.println(sanduichesIngredientes.createPresunto().descricao());
		System.out.println(sanduichesIngredientes.createSalada().descricao());
		return sanduichesIngredientes;
	}
}
