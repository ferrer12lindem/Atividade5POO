package questao2;

public class PresuntoFrango implements Presunto{

	@Override
	public String prepare() {
		return"Tempo de preparo: 10\nTemperatura: 10°C";
	}

	@Override
	public String descricao() {
		return"Presunto de frango";
	}
}
