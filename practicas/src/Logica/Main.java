package Logica;

public class Main {
    public static void main(String[] args) {
        // crear objetos de tipo estudiante (sirve tambien para crear objetos de otro tipo)
        // tipo de dato(en este caso objeto estudiante) | nombre de la variable | = | new | nombre del objeto();

        // Estudiante alucno = new Estudiante();
        // alucno.agregarEstudiante();
        // alucno.mostrarEstudiantes();
        // alucno.actualizarNota(0);
        // alucno.mostrarEstudiantes();

        Docente objeto = new Docente();
        objeto.agregarDocente();
        objeto.mostrarDocentes();

        objeto.actualizarDocente();
        objeto.mostrarDocentes();
        
        objeto.eliminarDocente();
    }
}
