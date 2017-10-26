package questao2;

public class SanduichesIngredientFactoryCG implements SanduichesIngredientFactory{
	
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
}
