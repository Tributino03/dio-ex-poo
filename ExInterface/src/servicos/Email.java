package servicos;

public record Email(String message) implements Message{

	@Override
	public String getMessage() {
		return "Your message was sent by E-mail: " + message;
	}

}
