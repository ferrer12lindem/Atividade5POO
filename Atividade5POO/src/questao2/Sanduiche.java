package questao2;

public abstract class Sanduiche {

	protected String nome;
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	
	public void descricao(){
		System.out.println("Duas fatias de pães");
		System.out.println("Uma fatia de queijo");
		System.out.println("Uma fatia de presunto");
	}
	
	public abstract void preparar();
	
	public void box(){
		System.out.println("Embala sanduiche");
	}
	
}
