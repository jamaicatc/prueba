package Logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Docente {
    int id;
    String nombre;
    String apellido;
    
    ArrayList<Docente> listaDocentes = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public Docente() {
    }

    public Docente(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public ArrayList<Docente> getListaDocentes () {
        return listaDocentes;
    }

    public void setListaEstudiantes (ArrayList<Docente> listaDocentes) {
        this.listaDocentes = listaDocentes;
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

    //CRUD de docente, Create, Read, Update, Delete
}
