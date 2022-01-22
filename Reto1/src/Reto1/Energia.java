package Reto1;

public class Energia {

    private int consumoE;
    private double valorE = 6200;
    private int estratoE;
    private double costoE;
    private double dto_stoE;
    private double impuestoE;
    private double totalE;

    public int getConsumoE() {
        return consumoE;
    }

    public void setConsumoE(int consumoE) {
        this.consumoE = consumoE;
    }

    public double getValorE() {
        return valorE;
    }

    public void setValorE(double valorE) {
        this.valorE = valorE;
    }

    public int getEstratoE() {
        return estratoE;
    }

    public void setEstratoE(int estratoE) {
        this.estratoE = estratoE;
    }

    public double getCostoE() {
        return costoE;
    }

    public void setCostoE(double costoE) {
        this.costoE = costoE;
    }

    public double getDto_stoE() {
        return dto_stoE;
    }

    public void setDto_stoE(double dto_stoE) {
        this.dto_stoE = dto_stoE;
    }

    public double getImpuestoE() {
        return impuestoE;
    }

    public void setImpuestoE(double impuestoE) {
        this.impuestoE = impuestoE;
    }

    public double getTotalE() {
        return totalE;
    }

    public void setTotalE(double totalE) {
        this.totalE = totalE;
    }

    public void calcular_totalE() {
        costoE = consumoE * valorE; 
        if (estratoE == 1 || estratoE == 2) {
            dto_stoE = costoE * -0.5;
        } else if (estratoE == 3 || estratoE == 4) {
            dto_stoE = costoE * -0.1;
        } else if (estratoE == 5 || estratoE == 6) {
            dto_stoE = costoE * 0.25;
        } else {
            System.out.println("Error en el valor ingresado");
        }
        impuestoE = costoE * 0.01;
        totalE = costoE + dto_stoE + impuestoE;
        System.out.println("El consumo fue: " + consumoE);
        System.out.println("Valor unidad: " + valorE);
        System.out.println("Estrato del inmueble: " + estratoE);
        System.out.println("Costo total: " + costoE);
        System.out.println("Descuento o sobrecosto: " + dto_stoE);
        System.out.println("Impuesto por infraestructura: " + impuestoE);
        System.out.println("TOTAL A PAGAR: " + totalE);
    }
}
