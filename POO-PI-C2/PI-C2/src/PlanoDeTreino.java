public class PlanoDeTreino implements Exibir, Treino {
    private String nome;
    private int duracaoSemanas;
    private String nivel;

    public PlanoDeTreino() {
        this.nome = "Plano Básico";
        this.duracaoSemanas = 4;
        this.nivel = "Iniciante";
    }

    public PlanoDeTreino(String nome, int duracaoSemanas, String nivel) {
        this.nome = nome;
        this.duracaoSemanas = duracaoSemanas;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracaoSemanas() {
        return duracaoSemanas;
    }

    public void setDuracaoSemanas(int duracaoSemanas) {
        this.duracaoSemanas = duracaoSemanas;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void exibirPlano() {
        System.out.println("Plano de Treino: " + nome);
        System.out.println("Duração: " + duracaoSemanas + " semanas");
        System.out.println("Nível: " + nivel);
    }

    @Override
    public void configurarPlano(String nome, int duracaoSemanas, String nivel) {
        setNome(nome);
        setDuracaoSemanas(duracaoSemanas);
        setNivel(nivel);
    }

    @Override
    public void alterarDuracao(int novaDuracao) {
        setDuracaoSemanas(novaDuracao);
    }

    @Override
    public void exibir() {
        exibirPlano();
    }
}
