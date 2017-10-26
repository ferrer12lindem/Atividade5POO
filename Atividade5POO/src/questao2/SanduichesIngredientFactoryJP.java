 package questao2;

public class SanduichesIngredientFactoryJP implements SanduichesIngredientFactory{

	@Override
	public Pao createPao() {
		return new PaoFrances();
	}

	@Override
	public Queijo createQueijo() {
		return new QueijoMussarela();
	}

	@Override
	public Presunto createPresunto() {
		return new PresuntoFrango();
	}

	@Override
	public Salada createSalada() {
		return new SaladaComVerdura();
	}
}
