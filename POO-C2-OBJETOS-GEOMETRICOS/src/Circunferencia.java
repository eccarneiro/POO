public class Circunferencia extends ObjetoGeometrico {
    private final double raio;
    private double area;
    private double perimetro;
    public Circunferencia(double r) {
        this.raio = r;
    }
    @Override
    public double getArea() {
        area = Math.PI * (raio * raio);
        return area;
    }

    @Override
    public double getPerimetro() {

        perimetro = 2 * Math.PI * raio;
        return perimetro;
    }
}
