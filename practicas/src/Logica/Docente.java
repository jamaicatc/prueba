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
    int unoDosTres = 0;

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
            System.out.println("\n-----------------------");
            System.out.println("Lista de docentes: ");
            for(Docente d : listaDocentes) {
                System.out.println("ID: " + d.getId());
                System.out.println("Nombre: " + d.getNombre());
                System.out.println("Apellido: " + d.getApellido());
                System.out.println("-----------------------");
            }
        }
    }

    // Método para actualizar docentes existentes por su id, por su nombre o por su apellido
    public void actualizarDocente() {
        boolean condicion = true;
        while (condicion) {
            System.out.println("\nPresione 1 para actualizar identificación");
            System.out.println("Presione 2 para actualizar nombre");
            System.out.println("Presione 3 para actualizar apellido");
            System.out.println("Presione 4 para salir");
            unoDosTres = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer después de leer un número.
    
            switch (unoDosTres) {
                case 1:
                    if (listaDocentes.isEmpty()) {
                        System.out.println("No hay docentes registrados");
                    } else {
                        System.out.println("\nIngrese el ID actual del docente: ");
                        int idIngresado = scanner.nextInt();
                        scanner.nextLine(); // Limpiar el buffer
    
                        boolean encontrado = false;
                        for (Docente d : listaDocentes) {
                            if (d.getId() == idIngresado) {
                                System.out.println("Ingrese la nueva identificación: ");
                                d.setId(scanner.nextInt());
                                scanner.nextLine(); // Limpiar el buffer
                                System.out.println("¡Identificación actualizada!");
                                encontrado = true;
                                break;
                            }
                        }
    
                        if (!encontrado) {
                            System.out.println("Docente no encontrado.");
                        }
                    }
                    break;
    
                case 2:
                    if (listaDocentes.isEmpty()) {
                        System.out.println("No hay docentes registrados");
                    } else {
                        System.out.println("\nIngrese el nombre actual del docente: ");
                        String nombreIngresado = scanner.nextLine();
    
                        boolean encontrado = false;
                        for (Docente d : listaDocentes) {
                            if (d.getNombre().equals(nombreIngresado)) {
                                System.out.println("Ingrese el nuevo nombre: ");
                                d.setNombre(scanner.nextLine());
                                System.out.println("¡Nombre actualizado!");
                                encontrado = true;
                                break;
                            }
                        }
    
                        if (!encontrado) {
                            System.out.println("Docente no encontrado.");
                        }
                    }
                    break;
    
                case 3:
                    if (listaDocentes.isEmpty()) {
                        System.out.println("No hay docentes registrados");
                    } else {
                        System.out.println("\nIngrese el apellido actual del docente: ");
                        String apellidoIngresado = scanner.nextLine();
    
                        boolean encontrado = false;
                        for (Docente d : listaDocentes) {
                            if (d.getApellido().equals(apellidoIngresado)) {
                                System.out.println("Ingrese el nuevo apellido: ");
                                d.setApellido(scanner.nextLine());
                                System.out.println("¡Apellido actualizado!");
                                encontrado = true;
                                break;
                            }
                        }
    
                        if (!encontrado) {
                            System.out.println("Docente no encontrado.");
                        }
                    }
                    break;
    
                case 4:
                    condicion = false;
                    break;
    
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    public void eliminarDocente() {
        if (listaDocentes.isEmpty()) {
            System.out.println("No hay docentes registrados.");
        } else {
            System.out.println("\nIngrese el ID del docente que desea eliminar: ");
            int idIngresado = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
    
            boolean encontrado = false;
    
            for (Docente d : listaDocentes) {
                if (d.getId() == idIngresado) {
                    listaDocentes.remove(d);
                    System.out.println("¡Docente eliminado con éxito!");
                    encontrado = true;
                    break;
                }
            }
    
            if (!encontrado) {
                System.out.println("Docente no encontrado.");
            }
        }
    }    
}
    //CRUD de docente, Create, Read, Update, Delete
