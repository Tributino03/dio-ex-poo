package servicos;

public record WhatsApp(String message) implements Message{

	@Override
	public String getMessage() {
		return "Your message was sent by WhatsApp: " + message;
	}

}
