package Logica;

public class Estudiante {
    int id;
    String nombre;
    String apellido;
    int nota;
    //en los metodos void no hay return, ya que estos metodos solo hacen procedimientos que no se van a reutilizar nuevamente en el codigo
    public void mostrarNombre(){
        System.out.println("el nombre del estudiante es: " + nombre);
    }

    public void resultadoAprobacion(int nota){
        if(nota >=3){
            System.out.println("el estudiante: " + nombre + "aprobo con una nota de: " + nota);
        }
        else{
            System.out.println("el estudiante: " + nombre + "no aprobo, su nota fue de: " + nota);
        }
    }
}
