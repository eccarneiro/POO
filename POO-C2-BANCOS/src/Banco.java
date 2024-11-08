public class Banco {
    public static void main(String args[]) {
        Conta c1 = new ContaNormal();
        c1.setNumero("1654-3");
        c1.setSaldo(500);
        
        ContaDebEspecial c2 = new ContaDebEspecial();
        ContaDebEspecial c3 = new ContaDebEspecial("4067-6", 2500, 5050);
        
        c2.setNumero("4067-6");
        c2.setSaldo(2500);
        c2.setLimite(1000.67);
        
        System.out.println("A conta número " + c1.getNumero() + " possui saldo " + c1.getSaldo());
        
        c1.creditar(1000);
        System.out.println("Após o crédito de R$ 1000,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());
        
        c1.debitar(100);
        System.out.println("Após o débito de R$ 100,00, a conta número " + c1.getNumero() + " passou a ter saldo " + c1.getSaldo());

        System.out.println("\nA conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo());
        
        c2.debitar(500);
        System.out.println("Após o débito de R$ 500,00, a conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo());
        
        System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " e Limite de " + c2.getLimite());
        
        c2.setLimite(10000);
        System.out.println("A conta número " + c2.getNumero() + " possui saldo " + c2.getSaldo() + " e novo Limite de " + c2.getLimite());
    }
}

class Conta {
    private String numero;
    private double saldo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void creditar(double valor) {
        saldo += valor;
    }

    public void debitar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para realizar o débito.");
        }
    }
}

class ContaNormal extends Conta {}

class ContaDebEspecial extends Conta {
    private double limite;

    public ContaDebEspecial() {}

    public ContaDebEspecial(String numero, double saldo, double limite) {
        super.setNumero(numero);
        super.setSaldo(saldo);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void debitar(double valor) {
        if (getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o débito.");
        }
    }
}
