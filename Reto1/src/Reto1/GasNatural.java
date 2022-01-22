package Reto1;

public class GasNatural {

    private int consumoGN;
    private double valorGN = 5234;
    private int estratoGN;
    private double costoGN;
    private double dto_stoGN;
    private double impuestoGN;
    private double totalGN;

    public int getConsumoGN() {
        return consumoGN;
    }

    public void setConsumoGN(int consumoGN) {
        this.consumoGN = consumoGN;
    }

    public double getValorGN() {
        return valorGN;
    }

    public void setValorGN(double valorGN) {
        this.valorGN = valorGN;
    }

    public int getEstratoGN() {
        return estratoGN;
    }

    public void setEstratoGN(int estratoGN) {
        this.estratoGN = estratoGN;
    }

    public double getCostoGN() {
        return costoGN;
    }

    public void setCostoGN(double costoGN) {
        this.costoGN = costoGN;
    }

    public double getDto_stoGN() {
        return dto_stoGN;
    }

    public void setDto_stoGN(double dto_stoGN) {
        this.dto_stoGN = dto_stoGN;
    }

    public double getImpuestoGN() {
        return impuestoGN;
    }

    public void setImpuestoGN(double impuestoGN) {
        this.impuestoGN = impuestoGN;
    }

    public double getTotalGN() {
        return totalGN;
    }

    public void setTotalGN(double totalGN) {
        this.totalGN = totalGN;
    }

    public void calcular_totalGN() {
        costoGN = consumoGN * valorGN;
        if (estratoGN == 1 || estratoGN == 2) {
            dto_stoGN = costoGN * -0.5;
        } else if (estratoGN == 3 || estratoGN == 4) {
            dto_stoGN = costoGN * -0.1;
        } else if (estratoGN == 5 || estratoGN == 6) {
            dto_stoGN = costoGN * 0.25;
        } else {
            System.out.println("Error en el valor ingresado");
        }
        impuestoGN = costoGN * 0.01;
        totalGN = costoGN + dto_stoGN + impuestoGN;
        System.out.println("El consumo fue: " + consumoGN);
        System.out.println("Valor unidad: " + valorGN);
        System.out.println("Estrato del inmueble: " + estratoGN);
        System.out.println("Costo total: " + costoGN);
        System.out.println("Descuento o sobrecosto: " + dto_stoGN);
        System.out.println("Impuesto por infraestructura: " + impuestoGN);
        System.out.println("TOTAL A PAGAR: " + totalGN);
    }
}
