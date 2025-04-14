package servicos;

public record RedesSociais(String message) implements Message{

	@Override
	public String getMessage() {
		return "Your message was sent by Redes Sociais: " + message;
	}

}
