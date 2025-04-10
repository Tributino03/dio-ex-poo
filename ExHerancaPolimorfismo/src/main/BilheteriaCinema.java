package Main;
import java.util.ArrayList;
import cinema.Ingresso;
import cinema.IngressoInteiro;
import cinema.IngressoFamilia;
import cinema.MeiaEntrada;

import java.util.Scanner;


public class BilheteriaCinema {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       ArrayList<Ingresso> ingressos = new ArrayList<>();
        
        System.out.print("Quantos ingressos deseja comprar? ");
        int qtdIngressos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < qtdIngressos; i++) {
            System.out.println("\nEscolha o tipo de ingresso:");
            System.out.println("1 - Ingresso Inteiro");
            System.out.println("2 - Meia Entrada");
            System.out.println("3 - Ingresso Família");
            int opcao = sc.nextInt();
            sc.nextLine();

            System.out.print("Nome do filme: ");
            String nomeFilme = sc.nextLine();
            
            System.out.print("Áudio (dublado/legendado): ");
            String audio = sc.nextLine();
            
            Ingresso ingresso = null;

            switch (opcao) {
                case 1:
                    ingresso = new IngressoInteiro(50, nomeFilme, audio);
                    break;
                case 2:
                    ingresso = new MeiaEntrada(50, nomeFilme, audio);
                    break;
                case 3:
                    System.out.print("Quantas pessoas vão usar esse ingresso família? ");
                    int numPessoas = sc.nextInt();
                    ingresso = new IngressoFamilia(50, nomeFilme, audio, numPessoas);
                    sc.nextLine(); 
                    ingressos.add(ingresso);
                    i = qtdIngressos;
                    break;
                default:
                    System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
                    i--; 
                    continue;
            }

            if (opcao != 3) {
                ingressos.add(ingresso);
            }
        }

        
        System.out.println("\nResumo dos ingressos:");
        for (Ingresso ingresso : ingressos) {
            System.out.println("--------------------------------");
            System.out.println("Filme: " + ingresso.getNomeFilme());
            System.out.println("Áudio: " + ingresso.getAudio());
            System.out.println("Valor final: R$ " + ingresso.valorReal());
        }

        sc.close();
    }


}
