package interfaces_figuras_geometricas;

public class Circulo implements FigurasGeometricas {

    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public void DibujarFigura() {
        System.out.println("  (     )");
        System.out.println(" (       )");
        System.out.println("(         )");
        System.out.println(" (       )");
        System.out.println("  (     )");
    }
    
    @Override
    public double CalcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
