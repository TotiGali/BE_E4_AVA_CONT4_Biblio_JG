/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ava_cont_4_biblioteca_jg;
import java.util.*;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author jordi Gali
 */
public class Libro {
    private String titulo;
    private Autor autor;
    private Boolean disponible;
    public static List<Libro> todosLibros = new ArrayList<>();
    

    public Libro(String titulo, Autor autor, Boolean disponible){
            this.titulo = titulo;
            this.autor = autor;
            this.disponible = true;
            todosLibros.add(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }
    
    public Boolean getDisponible() {
        return true;
    }

    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }

    public static List<Libro> getLibrosDisponibles() {
        List<Libro> librosDisponibles = new ArrayList<>();
        for (Libro libro : todosLibros) {
            if (libro.getDisponible()) {
                librosDisponibles.add(libro);
            }
        }
        return librosDisponibles;
    }
    
    public static List<Libro> getTodosLibros() {
    return todosLibros;
    }       
    
    //marcar_prestado(): Cambia el estado de `disponible` a `False`.
    public void marcarPrestado() {
    this.disponible = false;
    }
    
    //marcar_devuelto(): Cambia el estado de `disponible` a `True`.
    public void marcarDevuelto() {
    this.disponible = true;
    }
}


