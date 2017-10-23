package questao1;

public abstract class Lanchonete{ 

	public Sanduiche orderSanduiche(String type){
		Sanduiche sanduiche = createSanduiche();
		sanduiche.descricao();
		System.out.println("\nPreparando...");
		sanduiche.createPao();
		sanduiche.createQueijo();
		sanduiche.createPresunto();
		sanduiche.createSalada();
		sanduiche.box();
		return sanduiche;
	}
	
	public abstract Sanduiche createSanduiche();
}
