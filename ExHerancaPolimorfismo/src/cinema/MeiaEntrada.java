package cinema;
public class MeiaEntrada extends Ingresso{

	public MeiaEntrada(double valor, String nomeFilme, String audio) {
		super(valor, nomeFilme, audio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double valorReal() {
		return valor / 2;
	}

	
}
