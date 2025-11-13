public class Rettangolo {
    private double altezza, base;

    public Rettangolo(double b, double a) {
        base = b;
        altezza = a;
    }

    public double area() {
        return base * altezza;
    }

    public double perimetro() {
        return altezza * 2 + base * 2;
    }

    public boolean isQuadrato() {
        return base == altezza;
    }

    public String toString() {
        return "Rettangolo " + base + "*" + altezza + ", area=" + this.area() + ", perimetro=" + this.perimetro();
    }

}
