package questao2;

public class SaladaComVerdura implements Salada{

	@Override
	public String prepare() {
		return"Tempo de preparo: 10\nTemperatura: 13°C";
	}

	@Override
	public String descricao() {
		return"Salada com verdura";
	}
}
