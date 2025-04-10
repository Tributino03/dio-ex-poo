package cinema;

public abstract class Ingresso {
	
	protected double valor;
	
	protected String nomeFilme;
	
	protected String audio;
	
	 public Ingresso(double valor, String nomeFilme, String audio) {
		this.valor = valor;
		this.nomeFilme = nomeFilme;
		this.audio = audio;  
	}
	 
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
    
    public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public abstract double valorReal();
}
