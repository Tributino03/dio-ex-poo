package servicos;

import java.util.Scanner;

public class MarketingMessageMenu {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	
	
	int option;
	
	System.out.println("Choose the service where you want to send the message:");
	
	do {
		System.out.println("Digite 1 - SMS");
		System.out.println("Digite 2 - E-mail");
		System.out.println("Digite 3 - Redes Sociais");
		System.out.println("Digite 4 - WhatsApp");
		System.out.println("Digite 0 - Sair");
		option = sc.nextInt();
		sc.nextLine();
		
		switch(option) {
		case 1 -> System.out.println(messageSms().getMessage());
        case 2 -> System.out.println(messageEmail().getMessage());
        case 3 -> System.out.println(messageRedesSociais().getMessage());
        case 4 -> System.out.println(messageWhatsApp().getMessage());
        case 0 -> System.out.println("Leaving");
        default -> System.out.println("Invalid option.");
		}
		
	}while(option != 0);

	
	}
	
	public static Message messageSms() {
		System.out.println("Enter your message: ");
		var sms = sc.nextLine();
		return new Sms(sms);
	}
	
	public static Message messageEmail() {
		System.out.println("Enter your message: ");
		var email = sc.nextLine();
		return new Email(email);
	}
	
	public static Message messageRedesSociais() {
		System.out.println("Enter your message: ");
		var redesSociais = sc.nextLine();
		return new RedesSociais(redesSociais);
	}
	
	public static Message messageWhatsApp() {
		System.out.println("Enter your message: ");
		var whatsApp = sc.nextLine();
		return new WhatsApp(whatsApp);
	}

}
