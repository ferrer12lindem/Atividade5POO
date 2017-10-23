package questao2;

public class PresuntoPeru implements Presunto{

	@Override
	public String prepare() {
		return"Tempo de preparo: 3\nTemperatura: -10°C";
	}

	@Override
	public String descricao() {
		return"Presunto de peru";
	}
}
