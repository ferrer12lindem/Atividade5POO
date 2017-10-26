package questao2;

public class QueijoMussarela implements Queijo{

	@Override
	public String prepare() {
		return"Tempo de preparo: 6\nTemperatura: 15°C";
	}

	@Override
	public String descricao() {
		return"Queijo mussarela";
	}
}
