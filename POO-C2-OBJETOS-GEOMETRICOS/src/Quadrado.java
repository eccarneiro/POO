public class Quadrado extends ObjetoGeometrico {
    private final double lado;
    public Quadrado(double l) {
        this.lado = l;
    }
    @Override
    public double getArea() {
        return lado * lado; 
    }
    @Override
    public double getPerimetro() {
        return 4 * lado; 
    }
}
