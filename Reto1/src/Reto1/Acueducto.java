package Reto1;

public class Acueducto {

    private int consumoA;
    private double valorA = 9256;
    private int estratoA;
    private double costoA;
    private double dto_stoA;
    private double impuestoA;
    private double totalA;

    public int getConsumoA() {
        return consumoA;
    }

    public void setConsumoA(int consumoA) {
        this.consumoA = consumoA;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public int getEstratoA() {
        return estratoA;
    }

    public void setEstratoA(int estratoA) {
        this.estratoA = estratoA;
    }

    public double getCostoA() {
        return costoA;
    }

    public void setCostoA(double costoA) {
        this.costoA = costoA;
    }

    public double getDto_stoA() {
        return dto_stoA;
    }

    public void setDto_stoA(double dto_stoA) {
        this.dto_stoA = dto_stoA;
    }

    public double getImpuestoA() {
        return impuestoA;
    }

    public void setImpuestoA(double impuestoA) {
        this.impuestoA = impuestoA;
    }

    public double getTotalA() {
        return totalA;
    }

    public void setTotalA(double totalA) {
        this.totalA = totalA;
    }

    public void calcular_totalA() {
        costoA = consumoA * valorA;
        if (estratoA == 1 || estratoA == 2) {
            dto_stoA = costoA * -0.5;
        } else if (estratoA == 3 || estratoA == 4) {
            dto_stoA = costoA * -0.1;
        } else if (estratoA == 5 || estratoA == 6) {
            dto_stoA = costoA * 0.25;
        } else {
            System.out.println("Error en el valor ingresado");
        }
        impuestoA = costoA * 0.01;
        totalA = costoA + dto_stoA + impuestoA;
        System.out.println("El consumo fue: " + consumoA);
        System.out.println("Valor unidad: " + valorA);
        System.out.println("Estrato del inmueble: " + estratoA);
        System.out.println("Costo total: " + costoA);
        System.out.println("Descuento o sobrecosto: " + dto_stoA);
        System.out.println("Impuesto por infraestructura: " + impuestoA);
        System.out.println("TOTAL A PAGAR: " + totalA);
    }
}
