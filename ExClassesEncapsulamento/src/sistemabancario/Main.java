package sistemabancario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double saldo, chequeEspecial;
		do {
			System.out.println("Digite o valor do saldo inicial da conta:");
			saldo = sc.nextDouble();
		}while(saldo < 0);
		
		
		if(saldo > 500) {
			chequeEspecial = saldo/2;
		}else {
			chequeEspecial = 50.0;
		}
		
		ContaBancaria conta = new ContaBancaria(saldo, chequeEspecial);
		
		int opcao;
		do {
		    System.out.println("Digite o número da opção que deseja realizar:");
		    System.out.println("0: Sair");
		    System.out.println("1: Consultar saldo");
		    System.out.println("2: Consultar cheque especial");
		    System.out.println("3: Depositar dinheiro");
		    System.out.println("4: Sacar dinheiro");
		    System.out.println("5: Pagar boleto");
		    System.out.println("6: Verificar uso do cheque especial");

		    opcao = sc.nextInt();
		    
		    switch (opcao) {
		        case 1:
		            System.out.println("Saldo disponível: " + conta.getSaldo());
		            break;
		        case 2:
		            System.out.println("Cheque especial disponível: " + conta.getChequeEspecial());
		            break;
		        case 3:
		            System.out.println("Digite o valor do depósito:");
		            double deposito = sc.nextDouble();
		            conta.deposito(deposito);
		            break;
		        case 4:
		            System.out.println("Digite o valor do saque:");
		            double saque = sc.nextDouble();
		            conta.saque(saque);
		            break;
		        case 5:
		            System.out.println("Digite o valor do boleto:");
		            double boleto = sc.nextDouble();
		            conta.pagarBoleto(boleto);
		            break;
		        case 6:
		            if (conta.verificaUsoChequeEspecial()) {
		                System.out.println("Atenção: Você está usando o cheque especial!");
		            } else {
		                System.out.println("Você não está usando o cheque especial.");
		            }
		            break;
		        case 0:
		            System.out.println("Saindo do sistema...");
		            break;
		        default:
		            System.out.println("Opção inválida!");
		    }
		} while (opcao != 0);

			
		
		sc.close();
	}

}
