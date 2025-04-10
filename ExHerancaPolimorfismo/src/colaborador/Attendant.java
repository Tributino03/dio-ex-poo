package colaborador;
import java.util.ArrayList;

public non-sealed class Attendant extends Employee{
	
	ArrayList<Double> historicoCaixa = new ArrayList<>();
	
	private double valorInicialCaixaDia;
	private double valorCaixa;
	private double pagamento;
	

	public Attendant(String name, String email, String senha, boolean administrator, double valorInicialCaixaDia) {
		super(name, email, senha, false);
		this.valorInicialCaixaDia = valorInicialCaixaDia;
		this.valorCaixa = valorInicialCaixaDia;
	}
	
	public double getValorInicialCaixaDia() {
		return valorInicialCaixaDia;
	}

	public double getValorCaixa() {
		return valorCaixa;
	}
	
	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	public void receberPagamentos(double pagamento) {
		 valorCaixa += pagamento;
		 pagamento = 0;
		 System.out.println("Pagamento recebido");
	}
	
	public void fecharCaixa() {
	    System.out.println("O caixa iniciou com o valor R$: " + getValorInicialCaixaDia() +
	                       " e encerrou o dia com R$:" + getValorCaixa());
	    System.out.println("Armazenando valor final no histórico e zerando o caixa.");
	    
	    historicoCaixa.add(valorCaixa);
	    valorCaixa = valorInicialCaixaDia; 
	}

	
	
}
