class Conta {
    private double saldo;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
        saldo = saldo - valor;
        return true;
    }

    return false;
}
    
}

class ContaEspecial extends Conta {
    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    @Override
    public boolean sacar(double valor) {
    if (valor > 0 && valor <= getSaldo() + limite) {
        setSaldo(getSaldo() - valor);
        return true;
    }

    return false;
}
}


public class Main {
    public static void main(String[] args) {

        // CONTA COMUM
        Conta conta = new Conta();
        conta.setSaldo(500);

        System.out.println("=== CONTA COMUM ===");
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());

        boolean resultado = conta.sacar(300);

        System.out.println("Saque realizado? " + resultado);
        System.out.println("Saldo final: R$ " + conta.getSaldo());

        // CONTA ESPECIAL
        ContaEspecial especial = new ContaEspecial();
        especial.setLimite(300);
        especial.setSaldo(500);

        // Polimorfismo: referencia Conta, objeto ContaEspecial
        Conta contaEspecial = especial;

        System.out.println("\n=== CONTA ESPECIAL ===");
        System.out.println("Saldo inicial: R$ " + contaEspecial.getSaldo());
        System.out.println("Limite adicional: R$ " + especial.getLimite());

        boolean resultadoEspecial = contaEspecial.sacar(700);

        System.out.println("Saque realizado? " + resultadoEspecial);
        System.out.println("Saldo final: R$ " + contaEspecial.getSaldo());
    }
}
