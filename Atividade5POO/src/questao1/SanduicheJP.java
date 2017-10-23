package questao1;

public class SanduicheJP extends Sanduiche{
	
	@Override
	public void descricao() {
		
		super.ingredientes = new PaoFrances();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new QueijoMussarela();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new PresuntoFrango();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new SaladaComVerdura();
		System.out.println(super.ingredientes.descricao());
	}

	@Override
	public void createSalada() {
		System.out.println("Salada com verdura");
	}
}
