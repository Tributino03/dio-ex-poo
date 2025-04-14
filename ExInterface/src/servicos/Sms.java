package servicos;

public record Sms(String message) implements Message{

	@Override
	public String getMessage() {
		return "Your message was sent by SMS: " + message;
	}

}
