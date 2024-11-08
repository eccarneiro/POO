abstract public class ContaEspecial extends Conta {

    protected double limite;

    protected void setLimite(double value) {
        limite = value;
    }

    protected double getLimite() {
        return limite;
    }

    @Override
    public void creditar(double valor) {
        setSaldo(getSaldo() + valor);
    }
    @Override
    public abstract void debitar(double valor);
}
