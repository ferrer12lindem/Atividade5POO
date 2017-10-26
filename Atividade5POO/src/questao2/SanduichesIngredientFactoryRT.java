package questao2;

public class SanduichesIngredientFactoryRT implements SanduichesIngredientFactory{

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
}
