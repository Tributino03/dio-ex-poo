package automovel;



public class Car{
	
	private Boolean desligado;
	private int velocidade;
	private int marcha;
	
	public Car(Boolean desligado, int velocidade, int marcha) {
		this.desligado = desligado;
		this.velocidade = velocidade;
		this.marcha = marcha;
	}
	
	public void desligar() {
		if(!desligado ) {
			if(velocidade == 0 && marcha == 0) {
				this.desligado = true;
				System.out.println("O carro foi desligado");
				}else {
					System.out.println("para desligar o carro a velocidade deve estar em 0 e o caarro em ponto morto");
				}
			}else {
				System.out.println("O carro ja está desligado");
			}
			
		
	}
	
	public void ligar() {
		if(!desligado) {
			System.out.println("O carro já está ligado");
		}else {
			this.desligado = false;
			System.out.println("o carro foi ligado");
		}
	}
	
	public void acelerar() {
		if(!desligado) {
			if(marcha == 0) {
				System.out.println("O carro nao pode acerelar em ponto morto, coloque a próxima marcha");
			}
			else if(marcha == 1 && velocidade >= 0 && velocidade < 20) {
				velocidade += 1;
				System.out.println("aumentou a velocidade");
			}else if(marcha == 2 && velocidade < 40) {
				velocidade += 1;
				System.out.println("aumentou a velocidade");
			}else if(marcha == 3 && velocidade < 60) {
				velocidade += 1;
				System.out.println("aumentou a velocidade");
			}else if(marcha == 4 && velocidade < 80) {
				velocidade += 1;
				System.out.println("aumentou a velocidade");
			}else if(marcha == 5 && velocidade < 100) {
				velocidade += 1;
				System.out.println("aumentou a velocidade");
			}else if(marcha == 6 && velocidade < 120) {
				velocidade += 1;
				System.out.println("aumentou a velocidade");
			}else{
				System.out.println("o carro já atingiu a velocidade máxima");
			}
		}else {
			System.out.println("Ligue o carro para poder acerelar");
		}
	}
	
	public void desacerelar() {
		if(!desligado) {
			if(velocidade > 0) {
				velocidade -= 1;
				System.out.println("diminuiu a velocidade");
			}else {
				System.out.println("O carro já está com a velocidade em 0");
			}
		}else {
			System.out.println("O carro está desligado");
		}
	}
	
	public void virarEsquerda() {
		if(!desligado) {
			if(velocidade > 0 && velocidade <= 40) {
				System.out.println("O carro virou pra esquerda");
			}else {
				System.out.println("A velocidade atual nao permite que o carro vire");
			}
		}else {
			System.out.println("O carro está desligado");
		}
		
	}
	
	public void virarDireita() {
		if(!desligado) {
			if(velocidade > 0 && velocidade <= 40) {
				System.out.println("O carro virou pra direita");
			}else {
				System.out.println("A velocidade atual nao permite que o carro vire");
			}
		}else {
			System.out.println("O carro está desligado");
		}
		
	}
	
	public void getVelocidade() {
	    System.out.println("A velocidade atual é " + this.velocidade); ;
	}

	
	public void aumentarMarcha() {
		if(!desligado) {
			if(marcha >= 0 && marcha < 6) {
				 marcha += 1;
				 System.out.println("a marcha foi aumentada");
			}else {
				System.out.println("O carro já está na ultima marcha");
			}
	}else {
		System.out.println("O carro está desligado");
	}
	
	}
		
	public void diminuirMarcha() {
		if(!desligado) {
			if(marcha > 0 && marcha <= 6) {
				 marcha -= 1;
				 System.out.println("a marcha foi diminuida");
			}else {
				System.out.println("O carro já está na marcha 0");
			}
		}else {
			System.out.println("O carro está desligado");
		}
	}
}




