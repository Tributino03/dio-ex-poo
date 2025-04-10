package sistemabancario;

public class ContaBancaria {
    
    private double saldo;
    private double chequeEspecial; 
    private double valorUsadoChequeEspecial; 

    public ContaBancaria(double saldo, double chequeEspecial) {
        this.saldo = saldo;
        this.chequeEspecial = chequeEspecial;
        this.valorUsadoChequeEspecial = 0;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void deposito(double deposito) {
        if (deposito > 0) {
            if (valorUsadoChequeEspecial > 0) {
                double taxa = valorUsadoChequeEspecial * 0.20; 
                saldo -= taxa; 
                System.out.println("Taxa de 20% sobre o cheque especial utilizado cobrada: " + taxa);
                valorUsadoChequeEspecial = 0; 
            }

            saldo += deposito; 
            System.out.println("Depósito realizado. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void saque(double saque) {
        if (saque > 0) {
            if (saldo + chequeEspecial < saque) {
                System.out.println("Saldo insuficiente, incluindo o cheque especial.");
            } else {
                saldo -= saque;
                System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);

                
                if (saldo < 0) {
                    valorUsadoChequeEspecial = Math.abs(saldo);
                    System.out.println("Cheque especial utilizado: " + valorUsadoChequeEspecial);
                }
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void pagarBoleto(double boleto) {
        if (boleto > 0) {
            if (saldo + chequeEspecial < boleto) {
                System.out.println("Saldo insuficiente, incluindo o cheque especial.");
            } else {
                saldo -= boleto;
                System.out.println("Pagamento realizado com sucesso. Novo saldo: " + saldo);

                
                if (saldo < 0) {
                    valorUsadoChequeEspecial = Math.abs(saldo);
                    System.out.println("Cheque especial utilizado: " + valorUsadoChequeEspecial);
                }
            }
        } else {
            System.out.println("Valor inválido para pagamento.");
        }
    }

    public boolean verificaUsoChequeEspecial() {
        return saldo < 0;
    }
}
