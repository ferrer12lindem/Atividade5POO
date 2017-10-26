package questao2;

public class QueijoCheddar implements Queijo{

	@Override
	public String prepare() {
		return"Tempo de preparo: 3\nTemperatura: -10°C";
	}

	@Override
	public String descricao() {
		return"Queijo cheddar";
	}
}
