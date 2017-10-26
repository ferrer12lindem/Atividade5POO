package questao1;

public class LanchoneteRT extends Lanchonete {

	@Override
	public Sanduiche createSanduiche() {
		return new SanduicheRT();
	}

}
