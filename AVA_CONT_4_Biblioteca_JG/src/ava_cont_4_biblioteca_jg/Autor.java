/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ava_cont_4_biblioteca_jg;

import java.util.List;
import java.util.List;
import java.util.ArrayList;


/**
 *
 * @author jordi
 */
public class Autor {
    private String nombre;
    public List<Libro> listaLibros;

    public Autor(String nombre){
            this.nombre = nombre;
            this.listaLibros = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public List<Libro> getListaLibros() {
        return listaLibros;
    }
    
    //publicar_libro(libro): Añade un libro a la lista de libros del autor.
    public void publicarLibro(Libro libro) {
        listaLibros.add(libro);
    }   
}