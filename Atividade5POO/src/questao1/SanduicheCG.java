package questao1;

public class SanduicheCG extends Sanduiche{
	
	@Override
	public void descricao() {
		
		super.ingredientes = new PaoIntegral();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new QueijoPrato();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new PresuntoFrango();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new SaladaSemVerdura();
		System.out.println(super.ingredientes.descricao());
	}
}
