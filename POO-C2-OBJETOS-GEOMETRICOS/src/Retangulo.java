public class Retangulo extends ObjetoGeometrico {
    private final double comprimento;
    private final double altura;
    private double area; 
    private double perimetro; 
    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        area = comprimento * altura;
        return area;
    }
    @Override
    public double getPerimetro() {
        perimetro = (2 * comprimento) + (2 * altura);
        return perimetro;
    }
}
