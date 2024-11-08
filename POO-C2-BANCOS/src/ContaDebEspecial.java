public class ContaDebEspecial extends ContaEspecial {

    public ContaDebEspecial() {
        super();
    }

    public ContaDebEspecial(String n, double s, double l) {
        super();
        setNumero(n);
        setSaldo(s);
        setLimite(l);
    }

    @Override
    public void debitar(double valor) {
        if ((getSaldo() + getLimite() - valor) >= 0) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo e limite insuficientes para realizar o débito.");
        }
    }
}
