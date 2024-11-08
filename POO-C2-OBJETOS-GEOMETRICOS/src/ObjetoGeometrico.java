public abstract class ObjetoGeometrico {
    protected String cor;
    public abstract double getArea();
    public abstract double getPerimetro();
    public String getCor() {
        return cor;
    }
    public void setCor(String c) {
        cor = c;
    }
}
