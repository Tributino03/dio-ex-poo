package cinema;
public class IngressoFamilia extends Ingresso{
	
	private int pessoas;

	public IngressoFamilia(double valor, String nomeFilme, String audio, int pessoas) {
		super(valor, nomeFilme, audio);
		this.pessoas = pessoas;
		
	}

	@Override
	public double valorReal() {
		return pessoas > 3 ? (valor * pessoas) * 0.95 : valor * pessoas;
	}
	
	

}
