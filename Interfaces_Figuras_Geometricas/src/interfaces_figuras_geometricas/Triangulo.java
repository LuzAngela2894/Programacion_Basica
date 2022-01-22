package interfaces_figuras_geometricas;

public class Triangulo implements FigurasGeometricas {

    private double base;
    private double altura;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void DibujarFigura() {
        System.out.println("   *");
        System.out.println("  ***");
        System.out.println(" *****");
        System.out.println("*******");
    }

    @Override
    public double CalcularArea() {
        return (base * altura) / 2;
    }
}
