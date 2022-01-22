package programa;

import java.io.Serializable;

public class Docente implements Serializable {//LOS OBJETOS SE PUEDEN CONVERTIR A BYTES

    //ATRIBUTOS
    private String nombre;
    private String cargo;
    private String area;
    private int edad;

    //GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
