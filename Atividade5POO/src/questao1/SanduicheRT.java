package questao1;

public class SanduicheRT extends Sanduiche{

	@Override
	public void descricao() {
		
		super.ingredientes = new PaoBola();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new QueijoCheddar();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new PresuntoPeru();
		System.out.println(super.ingredientes.descricao());
		
		super.ingredientes = new SaladaSemVerdura();
		System.out.println(super.ingredientes.descricao());
	}

	@Override
	public void createSalada() {
		System.out.println("Salada sem verdura");
	}
}
