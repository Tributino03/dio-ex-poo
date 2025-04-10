package colaborador;

public non-sealed class Manager extends Employee{

	public Manager(String name, String email, String senha, boolean administrator) {
		super(name, email, senha, true);
	}
	
	public void gerarRelatorioFinanceiro(Employee atendente) {
		 if (atendente instanceof Attendant atendente1) {
			 System.out.println("Valor inicial do caixa: " + atendente1.getValorInicialCaixaDia());
			    System.out.println("Valor final do caixa: " + atendente1.getValorCaixa());
			    System.out.println("Diferença no valor do caixa: " + (atendente1.getValorInicialCaixaDia() - atendente1.getValorCaixa()));
			    System.out.println("Valor armazenado do fechamento de caixa: " + atendente1.historicoCaixa);
	        }
	    
	}

	
	public void consultarVendas(Employee vendedor) {
		System.out.println("o atedente " + vendedor.name + " realizou " + ((Vendor) vendedor).getQtdVendas() + " vendas");
		
	}
	
	
	
}
