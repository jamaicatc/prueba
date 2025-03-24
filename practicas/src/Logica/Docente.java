package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Docente {
    int id;
    String nombre;
    String apellido;
    
    ArrayList<Docente> listaDocentes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int unoCero = 0;

    public Docente() {
    }

    public Docente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public ArrayList<Docente> getListaDocentes () {
        return listaDocentes;
    }

    public void setListaDocentes (ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
    }

// METODO PARA AGREGAR DOCENTES

    public void agregarDocente() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("\npresiona 1 para agregar un docente, presiona 0 para salir: ");
            unoCero = scanner.nextInt();
            switch (unoCero) {
                case 1:
                    // Solicitar datos del docente
                    System.out.print("ID del docente: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner

                    System.out.print("\nNombre del docente: ");
                    String nombre = scanner.nextLine();

                    System.out.print("\nApellido del docente: ");
                    String apellido = scanner.nextLine();

                    // Crear un objeto Docente y agregarlo a la lista
                    Docente nuevoDocente = new Docente(id, nombre, apellido);
                    listaDocentes.add(nuevoDocente);

                    System.out.println("\nDocente agregado");
                    break;
                case 0:
                    condicion = false;
                    break;
                default:
                    System.out.println("Opción no válida");
            }
            
            }
        }
    // Método para mostrar los docentes agregados
    public void mostrarDocentes() {
        if (listaDocentes.isEmpty()) {
            System.out.println("No hay docentes registrados.");
        } else {
            System.out.println("Lista de docentes: ");
            for(Docente d : listaDocentes) {
                System.out.println("-----------------------");
                System.out.println("ID: " + d.getId());
                System.out.println("Nombre: " + d.getNombre());
                System.out.println("Apellido: " + d.getApellido());
                System.out.println("-----------------------");
            }
        }
        }
    }
    //CRUD de docente, Create, Read, Update, Delete
