package interfaces_figuras_geometricas;

public class Interfaces_Figuras_Geometricas {

    public static void main(String[] args) {
        Triangulo objtr = new Triangulo();
        Cuadrado objcu = new Cuadrado();
        Circulo objci = new Circulo();
        objtr.setAltura(4);
        objtr.setBase(5);
        objcu.setLado(4);
        objci.setRadio(2);
        System.out.println("Dibujar Triángulo");
        objtr.DibujarFigura();
        System.out.println("Dibujar Cuadrado");
        objcu.DibujarFigura();
        System.out.println("Dibujar Círculo");
        objci.DibujarFigura();
        System.out.println("El área del triángulo es: " + objtr.CalcularArea());
        System.out.println("El área del cuadrado es: " + objcu.CalcularArea());
        System.out.println("El área del círculo es: " + objci.CalcularArea());
    }
}
