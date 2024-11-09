import java.util.ArrayList;
import java.util.List;

public class Academia implements Exibir {
    private final String nome;
    private final String endereco;
    private final List<PlanoDeTreino> planos;

    public Academia(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
        this.planos = new ArrayList<>();
    }

    public void adicionarPlano(PlanoDeTreino plano) {
        planos.add(plano);
    }

    @Override
    public void exibir() {
        System.out.println("Academia: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Planos Disponíveis:");
        for (PlanoDeTreino plano : planos) {
            plano.exibir();
        }
    }
}
