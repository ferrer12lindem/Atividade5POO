package questao1;

public class Main {
	
	public static void main(String args[]){
		
		Lanchonete lanchonete = null;		
		
		System.out.println("Sanduiche à moda João Pessoa:\n");
		lanchonete = new LanchoneteJP();
		System.out.println("Ingredientes: ");
		lanchonete.orderSanduiche("SanduicheJP");
	
		System.out.println("\n\nSanduiche à moda Rio Tinto:\n");
		lanchonete = new LanchoneteRT();
		System.out.println("Ingredientes: ");
		lanchonete.orderSanduiche("SanduicheRT");

		System.out.println("\n\nSanduiche à moda Campina Grande:\n");
		lanchonete = new LanchoneteCG();
		System.out.println("Ingredientes: ");
		lanchonete.orderSanduiche("SanduicheCG");		
	}
}
