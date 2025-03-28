package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
    int cedula;
    String nombre;
    String apellido;
    double nota;
    int edad;
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int numIngresado = 0;

    
    public Estudiante() {
    }

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


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudiante(){
        boolean condicion = true;
        while (condicion) {
            System.out.println("\npresiona 1 para agregar un estudiante, presiona 0 para salir: ");
            numIngresado = scanner.nextInt();
            switch (numIngresado) {
                case 1:
                    System.out.println("\nIngrese la cedula del estudiante: ");
                    int cedula = scanner.nextInt();
                    scanner.nextLine();
        
                    System.out.println("\nIngrese el nombre del estudiante: ");
                    String nombre = scanner.nextLine();
        
                    System.out.println("\nIngrese el apellido del estudiante: ");
                    String apellido = scanner.nextLine();
        
                    System.out.println("\nIngrese la nota del estudiante: ");
                    double nota = scanner.nextDouble();
        
                    Estudiante nuevoEstudiante = new Estudiante(cedula, nombre, apellido, nota);
                    listaEstudiantes.add(nuevoEstudiante);
                    System.out.println("\nESTUDIANTE AGREGADO CORRECTAMENTE");
                    break;
                case 0:
                    condicion = false;
                    break;
                default:
                    System.out.println("\nOpción no válida");
        }
        }
        
    }
    public void mostrarEstudiantes() {
        if (listaEstudiantes.isEmpty()) {
            System.out.println("\nNo hay estudiantes registrados.");
        } else {
            System.out.println("\nLista de estudiantes:");
            for (Estudiante e : listaEstudiantes) {
                System.out.println("Cédula: " + e.getCedula());
                System.out.println("Nombre: " + e.getNombre());
                System.out.println("Apellido: " + e.getApellido());
                System.out.println("Nota: " + e.getNota());
                System.out.println("-------------------------");
            }
        }
    }

        public void actualizarNota(int cedula){
            double nuevaNota;
            if(listaEstudiantes.isEmpty()){
                System.out.println("\nNo hay estudiantes registrados");
            } else {
                System.out.println("\ningrese la cedula del estudiante: ");
                int cedIngresada = scanner.nextInt();
                scanner.nextLine();
                boolean encontrado = false;
                for(Estudiante e: listaEstudiantes){
                    if(e.getCedula() == cedIngresada){
                        System.out.println("ingrese la nueva nota para el estudiante: ");
                        nuevaNota = scanner.nextDouble();
                        scanner.nextLine();
                        e.setNota(nuevaNota);
                        System.out.println("Nota actualizada correctamente");
                        encontrado = true;
                        break;
                    }
                }

                if(!encontrado){
                    System.out.println("error, estudiante no encontrado");   

                }
            }
        }
}
