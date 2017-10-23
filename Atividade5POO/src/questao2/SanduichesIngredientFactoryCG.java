package questao2;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{
	
	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	
	@Override
	public Pao createPao() {
		return new PaoIntegral();
	}

	@Override
	public Queijo createQueijo() {
		return new QueijoPrato();
	}

	@Override
	public Presunto createPresunto() {
		return new PresuntoFrango();
	}

	@Override
	public Salada createSalada() {
		return new SaladaSemVerdura();
	}
	
	public String toString(){
		return "Pão: "+this.createPao().descricao()+"\nQueijo: "+this.createQueijo().prepare()+this.createQueijo().descricao()
		+"\nPresunto: "+this.createPresunto().prepare()+this.createPresunto().descricao()+"\nSalada: "
				+this.createSalada().prepare()+this.createSalada().descricao();
	}
}
