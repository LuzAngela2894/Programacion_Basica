package switchclases;

public class Manzanas {

    private int cantidad;
    private double precio = 2000;
    private double total = 0;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double total_pagar() {
        if (cantidad >= 0 && cantidad <= 2) {
            total = (precio * cantidad) - (precio * cantidad * 0);
        } else if (cantidad >= 3 && cantidad <= 5) {
            total = (precio * cantidad) - (precio * cantidad * 0.10);
        } else if (cantidad >= 6 && cantidad <= 10) {
            total = (precio * cantidad) - (precio * cantidad * 0.15);
        } else if (cantidad >= 11) {
            total = (precio * cantidad) - (precio * cantidad * 0.20);
        } else {
            System.out.println("Error en la cantidad ingresada");
        }
        return total;
    }
}
