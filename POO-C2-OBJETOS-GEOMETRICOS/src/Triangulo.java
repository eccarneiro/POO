public class Triangulo extends ObjetoGeometrico {
    private final double base;
    private final double altura;
    public Triangulo(double b, double a) {
        this.base = b;
        this.altura = a;
    }
    @Override
    public double getArea() {
        return (base * altura) / 2; 
    }
    @Override
    public double getPerimetro() {
        return 3 * base;
    }
}
