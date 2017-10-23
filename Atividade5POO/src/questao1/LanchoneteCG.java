package questao1;

public class LanchoneteCG extends Lanchonete{

	@Override
	public Sanduiche createSanduiche() {
		return new SanduicheCG();
	}

}
