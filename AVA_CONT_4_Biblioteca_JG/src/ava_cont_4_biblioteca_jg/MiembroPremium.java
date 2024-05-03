/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ava_cont_4_biblioteca_jg;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jordi
 */
public class MiembroPremium extends Usuario {
    public List<Libro> listaReservados;

    public MiembroPremium(String nombre){
        super(nombre);
        this.listaReservados = new ArrayList<>();
    }
    
    public List<Libro> getListaReservados() {
        return listaReservados;
    }
    
    //reservar_libro(libro): Si el libro no est� disponible, lo a�ade a una lista de reservas. Si est� disponible, lo a�ade a su lista de libros prestados y cambia su disponibilidad.
    public void reservarLibro(Libro libro) {
    if (!libro.getDisponible()) {
        // Si el libro no est� disponible, lo a�ade a una lista de reservas
        listaReservados.add(libro); // A�adir el libro a la lista de libros reservados
        libro.setDisponible(false); // Cambiar la disponibilidad del libro a false
        System.out.println("El libro " + libro.getTitulo() + " ha sido reservado.");
    } else {
        // Si el libro est� disponible, lo a�ade a su lista de libros prestados y cambia su disponibilidad
        listaPrestados.add(libro); // A�adir el libro a la lista de libros prestados del usuario
        libro.setDisponible(false); // Cambiar la disponibilidad del libro a false
        System.out.println("El libro " + libro.getTitulo() + " ha sido prestado.");
    }
}

}
