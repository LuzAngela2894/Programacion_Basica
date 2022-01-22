package switchclases;

public class Notas {

    private String nombre;
    private String carrera;
    private float nota1;
    private float nota2;
    private float nota3;
    private float definitiva;
    private double beca;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(float definitiva) {
        this.definitiva = definitiva;
    }

    public double getBeca() {
        return beca;
    }

    public void setBeca(double beca) {
        this.beca = beca;
    }

    public void calcular_beca() {
        definitiva = (nota1 + nota2 + nota3) / 3;
        if ((definitiva >= 4.0 && definitiva <= 5.0) && (carrera.equals("Sistemas") || carrera.equals("sistemas"))) {
            beca = 1450000;
        } else if ((definitiva >= 4.2 && definitiva <= 5.0) && (carrera.equals("Electronica") || carrera.equals("electronica"))) {
            beca = 1480000;
        } else if ((definitiva >= 4.5 && definitiva <= 5.0) && (carrera.equals("Contaduria") || carrera.equals("contaduria"))) {
            beca = 1500000;
        } else if ((definitiva == 5.0) && (carrera.equals("Arquitectura") || carrera.equals("arquitectura"))) {
            beca = 1700000;
        } else {
            beca = 0;
        }
        System.out.println("El/La estudiante " + nombre + " de la carrera " + carrera
                + " obtuvo una definitiva de " + definitiva + " y se le otorga una beca de " + beca);
    }
}
