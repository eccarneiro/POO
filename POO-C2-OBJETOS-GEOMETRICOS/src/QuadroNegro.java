public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;

    public void limpaQuadro() {
        quadrado = null;
        retangulo = null;
        circunferencia = null;
        triangulo = null;
    }

    public void criaQuadrado(double l, String c) {
        quadrado = new Quadrado(l);
        quadrado.setCor(c);
    }

    public void criaRetangulo(double c, double a, String cor) {
        retangulo = new Retangulo(c, a);
        retangulo.setCor(cor);
    }

    public void criaCircunferencia(double r, String c) {
        circunferencia = new Circunferencia(r);
        circunferencia.setCor(c);
    }

    public void criaTriangulo(double b, double a, String c) {
        triangulo = new Triangulo(b, a);
        triangulo.setCor(c);
    }

    public void mostraAreaObjetos() {
        System.out.println("Quadrado. Área: " + quadrado.getArea());
        System.out.println("Retângulo. Área: " + retangulo.getArea());
        System.out.println("Triângulo. Área: " + triangulo.getArea());
        System.out.println("Circunferência. Área: " + circunferencia.getArea());
    }

    public void mostraPerimetroObjetos() {
        System.out.println("Quadrado. Perimetro: " + quadrado.getPerimetro());
        System.out.println("Retângulo. Perimetro: " + retangulo.getPerimetro());
        System.out.println("Triângulo. Perimetro: " + triangulo.getPerimetro());
        System.out.println("Circunferência. Perimetro: " + circunferencia.getPerimetro());
    }

    public void mostraCorObjetos() {
        System.out.println("Quadrado. Cor: " + quadrado.getCor());
        System.out.println("Retângulo. Cor: " + retangulo.getCor());
        System.out.println("Triângulo. Cor: " + triangulo.getCor());
        System.out.println("Circunferência. Cor: " + circunferencia.getCor());
    }

    public static void main(String args[]) {
        QuadroNegro quadroNegro = new QuadroNegro();
        quadroNegro.criaQuadrado(10.6, "Branco");
        quadroNegro.criaRetangulo(50.5, 20.4, "Azul");
        quadroNegro.criaTriangulo(6.7, 5.5, "Amarelo");
        quadroNegro.criaCircunferencia(10, "Verde");

        quadroNegro.mostraAreaObjetos();
        quadroNegro.mostraPerimetroObjetos();
        quadroNegro.mostraCorObjetos();
    }
}
