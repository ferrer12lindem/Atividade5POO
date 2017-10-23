package questao2;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory{

	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	
	@Override
	public Pao createPao() {
		return new PaoBola();
	}

	@Override
	public Queijo createQueijo() {
		return new QueijoCheddar();
	}

	@Override
	public Presunto createPresunto() {
		return new PresuntoPeru();
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
