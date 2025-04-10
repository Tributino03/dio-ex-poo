package colaborador;

public abstract sealed class Employee permits Manager, Vendor, Attendant {

	protected String name;
	protected String email;
	protected String senha;
	protected Boolean administrator;
	
	public Employee(String name, String email, String senha, boolean administrator) {
		this.name = name;
	    this.email = email;
	    this.senha = senha;
	    this.administrator = administrator;
	}
	
	public void realizarLogin() {
		
		System.out.println("Login realizado");
		
	}
	
	public void realizarLogoff() {
		
		System.out.println("Logoff realizado");
	}
	
	public void alterarDados() {
		
		System.out.println("Dados alterados");
	}
	
	public void alterarSenha() {
		
		System.out.println("Senha alterada");
	}
}

