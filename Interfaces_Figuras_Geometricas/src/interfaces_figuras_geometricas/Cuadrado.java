package interfaces_figuras_geometricas;

public class Cuadrado implements FigurasGeometricas {

    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void DibujarFigura() {
        System.out.println(" ---- ");
        System.out.println("|    |");
        System.out.println("|    |");
        System.out.println(" ---- ");
    }

    @Override
    public double CalcularArea() {
        return Math.pow(lado, 2);
    }
}
