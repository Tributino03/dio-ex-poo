package Main;

import java.util.Scanner;

import colaborador.Attendant;
import colaborador.Employee;
import colaborador.Manager;
import colaborador.Vendor;


public class Empresa {
	
public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Employee manager = new Manager("Gustavo", "tmdg2705@gmail.com", "123456", true);
        Employee vendedor = new Vendor("Afonso", "afn@gmail.com", "3455", false);
        Employee atendente = new Attendant("João", "joao@gmail.com", "senha", false, 1000.0);

        manager.realizarLogin();
        vendedor.realizarLogin();
        ((Vendor)vendedor).consultarVenda();
        ((Vendor)vendedor).realizarVendas();
        ((Vendor)vendedor).realizarVendas();
        ((Vendor)vendedor).realizarVendas();
        ((Vendor)vendedor).consultarVenda();
        atendente.realizarLogin();
        ((Attendant) atendente).receberPagamentos(1000);
        ((Attendant) atendente).receberPagamentos(200);
        ((Attendant) atendente).receberPagamentos(50);
        ((Attendant) atendente).receberPagamentos(450);
        ((Attendant) atendente).fecharCaixa();
        atendente.realizarLogoff();
        ((Vendor)vendedor).realizarVendas();
        ((Vendor)vendedor).realizarVendas();
        ((Vendor)vendedor).realizarVendas();
        vendedor.realizarLogoff();
        ((Manager) manager).consultarVendas(vendedor);
        ((Manager) manager).gerarRelatorioFinanceiro(atendente);
        manager.realizarLogoff();

        sc.close();
    }


}
