public class PlanoDeTreinoAvancado extends PlanoDeTreino {
    private boolean incluiTreinosAltaIntensidade;

    public PlanoDeTreinoAvancado() {
        super("Plano Avançado", 8, "Avançado");
        this.incluiTreinosAltaIntensidade = true;
    }

    public PlanoDeTreinoAvancado(String nome, int duracaoSemanas, boolean incluiTreinosAltaIntensidade) {
        super(nome, duracaoSemanas, "Avançado");
        this.incluiTreinosAltaIntensidade = incluiTreinosAltaIntensidade;
    }

    public boolean isIncluiTreinosAltaIntensidade() {
        return incluiTreinosAltaIntensidade;
    }

    public void setIncluiTreinosAltaIntensidade(boolean incluiTreinosAltaIntensidade) {
        this.incluiTreinosAltaIntensidade = incluiTreinosAltaIntensidade;
    }

    @Override
    public void exibirPlano() {
        super.exibirPlano();
        System.out.println("Inclui Treinos de Alta Intensidade: " + (incluiTreinosAltaIntensidade ? "Sim" : "Não"));
    }

    @Override
    public void exibir() {
        exibirPlano();
    }
}
