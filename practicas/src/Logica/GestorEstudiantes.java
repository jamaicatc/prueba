package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorEstudiantes{
    ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int numIngresado = 0;

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
}
