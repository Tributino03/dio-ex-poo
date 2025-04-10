package automovel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int velocidade = 0;
		int marcha = 0;
		boolean desligado = true;
		
		Car car = new Car (desligado, velocidade, marcha);
		
		int opcao;
		
		do {
			System.out.println("Digite 1: para ligar o carro");
			System.out.println("Digite 2: para desligar o carro");
			System.out.println("Digite 3: para acelerar");
			System.out.println("Digite 4: para desacelerar");
			System.out.println("Digite 5: para virar pra esquerda");
			System.out.println("Digite 6: para virar pra direita");
			System.out.println("Digite 7: para verificar a velocidade");
			System.out.println("Digite 8: para aumentar a marcha");
			System.out.println("Digite 9: para diminuir a marcha");
			System.out.println("Digite 0: para sair do menu");
			opcao = sc.nextInt();
			sc.nextLine();
			switch(opcao) {
				case 1:
					car.ligar();
					break;
				case 2:
					car.desligar();
					break;
				case 3:
					car.acelerar();
					break;
				case 4:
					car.desacerelar();
					break;
				case 5:
					car.virarEsquerda();
					break;
				case 6:
					car.virarDireita();
					break;
				case 7:
					car.getVelocidade();
					break;
				case 8:
					car.aumentarMarcha();
					break;
				case 9:
					car.diminuirMarcha();
					break;
				case 0:
					System.out.println("Saindo do sistema");
					break;
				default:
					System.out.println("opcao invalida");
					break;
			}
				
		}while(opcao != 0);
		
		sc.close();

	}

}
