public class Main {
    public static void main(String[] args) {
        Exibir user = new User();
        Exibir planoBasico = new PlanoDeTreino();
        Exibir planoAvancado = new PlanoDeTreinoAvancado();
        Academia academia = new Academia("Academia XYZ", "Rua das Flores, 123");

        academia.adicionarPlano((PlanoDeTreino) planoBasico);
        academia.adicionarPlano((PlanoDeTreino) planoAvancado);

        System.out.println("Dados do Usuário:");
        user.exibir();
        System.out.println();

        System.out.println("Dados da Academia:");
        academia.exibir();
    }
}
