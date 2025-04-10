package cinema;

public class IngressoInteiro extends Ingresso{

	public IngressoInteiro(double valor, String nomeFilme, String audio) {
		super(valor, nomeFilme, audio);
	}

	@Override
	public double valorReal() {
		return valor;
	}

}
