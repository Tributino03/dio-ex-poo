package colaborador;

public non-sealed class Vendor extends Employee{
	
	private int qtdVendas;
	
	public Vendor(String name, String email, String senha, boolean administrator) {
		super(name, email, senha, false);
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void realizarVendas() {
		qtdVendas += 1;
		System.out.println("Venda realizada");
	}
	
	public void consultarVenda() {
		System.out.println("Número de vendas: " + qtdVendas);
	}

	
}
