package questao1;

public abstract class Sanduiche {

	protected Ingredientes ingredientes;
	
	public abstract void descricao();
	
	public void createPao(){
		System.out.println("Duas fatias de pães");
		
	}
	public void createQueijo(){
		System.out.println("Uma fatia de queijo");
	}
	
	public void createPresunto(){
		System.out.println("Uma fatia de presunto");
	}
	
	public void box(){
		System.out.println("Embala sanduiche");
	}
}
