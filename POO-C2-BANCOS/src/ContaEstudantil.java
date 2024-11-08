public class ContaEstudantil extends ContaNormal {
    private double emprestimo;

    public ContaEstudantil(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    public double getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(double emprestimo) {
        this.emprestimo = emprestimo;
    }

    @Override
    public void creditar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public void debitar(double valor) {
        if ((getSaldo() - valor + emprestimo) >= 0) {
            setSaldo(getSaldo() - valor);
        } else {
            System.out.println("Saldo e limite de empréstimo insuficientes para realizar o débito.");
        }
    }
}
