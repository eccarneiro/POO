public class ContaNormal extends Conta {

    @Override
    public void creditar(double valor) {
        setSaldo(getSaldo() + valor);  // Usando métodos getters e setters
    }

    @Override
    public void debitar(double valor) {
        if (getSaldo() - valor >= 0) {
            setSaldo(getSaldo() - valor);  // Usando métodos getters e setters
        } else {
            System.out.println("Saldo insuficiente para realizar o débito.");
        }
    }
}
