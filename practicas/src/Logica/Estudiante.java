package Logica;

public class Estudiante {
    int cedula;
    String nombre;
    String apellido;
    double nota;
    int edad;
    public Estudiante(int cedula, String nombre, String apellido, double nota) {//constructor con parametros
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota = nota;
    }
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void mostrarInformacion(){
        System.out.println("nombre: " + nombre + " apellido: " + apellido);
    }

}
