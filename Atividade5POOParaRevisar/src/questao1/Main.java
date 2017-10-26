package questao1;

public class Main {
	
	public static void main(String args[]){
		
		Lanchonete lanchonete = null;		
		
		System.out.println("Sanduiche � moda Jo�o Pessoa:\n");
		lanchonete = new LanchoneteJP();
		System.out.println("Ingredientes: ");
		lanchonete.orderSanduiche("SanduicheJP");
	
		System.out.println("\n\nSanduiche � moda Rio Tinto:\n");
		lanchonete = new LanchoneteRT();
		System.out.println("Ingredientes: ");
		lanchonete.orderSanduiche("SanduicheRT");

		System.out.println("\n\nSanduiche � moda Campina Grande:\n");
		lanchonete = new LanchoneteCG();
		System.out.println("Ingredientes: ");
		lanchonete.orderSanduiche("SanduicheCG");		
	}
}
