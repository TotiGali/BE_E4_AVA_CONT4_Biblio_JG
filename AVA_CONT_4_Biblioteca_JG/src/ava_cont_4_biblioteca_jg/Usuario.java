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
public class Usuario {
    private String nombre;
    public List<Libro> listaPrestados;

    public Usuario(String nombre){
            this.nombre = nombre;
            this.listaPrestados = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public List<Libro> getListaPrestados() {
        return listaPrestados;
    }

    //tomar prestado método mejorado
    
    public void tomar_prestado(String titulo){

	boolean libroEncontrado = false;

	for(Libro libro: Libro.getTodosLibros()){ //Aquí recorremos la lista de los libros totales

		if(libro.getTitulo().equals(titulo)){ //Miro si el título del libro coincide con el nombre que le he pasado
			libroEncontrado = true;

			boolean dispo_libro = libro.getDisponible();
			if(dispo_libro == true){
                                libro.marcarPrestado();
				System.out.println("El libro con título: " + titulo + ", ha sido prestado al usuairo " + this.nombre);
				System.out.println("");
			}else{
				System.out.println("El lbro no esta disponible");
			}
			break;
		}
	}
	if(libroEncontrado == false){
		System.out.println("Libro no encontrado: " + nombre);
	}
    }
}
        
//        //tomar_prestado:  metodo anterior
//         //tomar_prestado(nombre_libro): Si el libro está disponible, lo añade a `libros_prestados` y cambia su disponibilidad.
//    
//        public void tomarPrestado(Libro libro) {
//            if (libro.getDisponible()) {
//                listaPrestados.add(libro);
//                libro.marcarPrestado();
//                System.out.println("\nEl libro '" + libro.getTitulo() + "' ha sido prestado a " + nombre);
//            } else {
//                System.out.println("\nEl libro '" + libro.getTitulo() + "' no está disponible para préstamo");
//            }
//        }
//
//        //devolver_libro(nombre_libro): Remueve un libro de `libros_prestados` y cambia su disponibilidad.
//
//        public void devolverLibro(Libro libro) {
//            if (listaPrestados.contains(libro)) {
//                listaPrestados.remove(libro);
//                libro.setDisponible(true);
//                System.out.println("\nEl libro '" + libro.getTitulo() + "' ha sido devuelto por " + nombre);
//            } else {
//                System.out.println("\nEl libro '" + libro.getTitulo() + "' no está en la lista de libros prestados por " + nombre);
//            }




