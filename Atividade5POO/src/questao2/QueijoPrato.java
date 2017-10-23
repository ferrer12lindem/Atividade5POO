package questao2;

public class QueijoPrato implements Queijo{

	@Override
	public String prepare() {
		return"Tempo de preparo: 8\nTemperatura: 12°C";
	}

	@Override
	public String descricao() {
		return"Queijo prato";
	}
}
