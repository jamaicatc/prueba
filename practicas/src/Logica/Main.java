package Logica;

public class Main {
    public static void main(String[] args) {
        //crear objetos de tipo estudiante (sirve tambien para crear objetos de otro tipo)
        //tipo de dato(en este caso objeto estudiante) | nombre de la variable | = | new | nombre del objeto();

        Docente anaMaria = new Docente();
        Docente juanDavid = new Docente(50, "Juan David", "Cardona");

        System.out.println("El id del docente 1 es: " + juanDavid.getId());
        System.out.println("El nombre del docente 1 es: " + juanDavid.getNombre() + "\nEl apellido del docente 1 es: " + juanDavid.getApellido());

        anaMaria.setId(100);
        anaMaria.setNombre("Ana Maria");
        anaMaria.setApellido("Gomez");

        System.out.println("---------------------------------------");
        System.out.println("El id del docente 1 es: " + anaMaria.getId());
        System.out.println("El nombre del docente 1 es: " + anaMaria.getNombre() + "\nEl apellido del docente 1 es: " + anaMaria.getApellido());

        Estudiante alucno = new Estudiante();
        alucno.agregarEstudiante();
    }
}
