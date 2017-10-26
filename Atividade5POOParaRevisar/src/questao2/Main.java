package questao2;

public class Main {
	
	public static void main(String args[]){

	Lanchonete lanchonete = null;
	
	System.out.println("No estilo de Rio Tinto:\n");
	lanchonete = new RTLanchonete();
	lanchonete.orderSanduiche(new SanduichesIngredientFactoryRT());

	System.out.println("\nNo estilo de João Pessoa:\n");
	lanchonete = new JPLanchonete();
	lanchonete.orderSanduiche(new SanduichesIngredientFactoryJP());
	
	System.out.println("\nNo estilo de Campina Grande:\n");
	lanchonete = new CGLanchonete();
	lanchonete.orderSanduiche(new SanduichesIngredientFactoryCG());
	
	}
}
