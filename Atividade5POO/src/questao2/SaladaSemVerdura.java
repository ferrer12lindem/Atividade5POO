package questao2;

public class SaladaSemVerdura implements Salada{

	@Override
	public String prepare() {
		return"Tempo de preparo: 3\nTemperatura: -10°C";
	}

	@Override
	public String descricao() {
		return"Salada sem verdura";
	}
}
