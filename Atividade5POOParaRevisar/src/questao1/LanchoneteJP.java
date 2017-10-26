package questao1;

public class LanchoneteJP extends Lanchonete{

	@Override
	public Sanduiche createSanduiche() {
		return new SanduicheJP();
	}

}
