/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ava_cont_4_biblioteca_jg;

/**
 *
 * @author jordi
 */
public class AVA_CONT_4_Biblioteca_JG {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Crear autores
        Autor autor1 = new Autor("J.K. Rowling");
        Autor autor2 = new Autor("Stephen King");

        // Imprimir información de los autores
        System.out.println("Se han creado los siguientes autores:");

        System.out.println("\nInformación del autor 1:");
        System.out.println("Nombre: " + autor1.getNombre());
        System.out.println("Lista de libros: " + autor1.getListaLibros());

        System.out.println("\nInformación del autor 2:");
        System.out.println("Nombre: " + autor2.getNombre());
        System.out.println("Lista de libros: " + autor2.getListaLibros());
        
        System.out.println("--------------------------------------------------");

        //Los autores publican libros
        
            // Publicar libros para autor1
            Libro libro1Autor1 = new Libro("Harry Potter y la piedra filosofal", autor1, true);
            Libro libro2Autor1 = new Libro("Harry Potter y la cámara secreta", autor1, true);
            autor1.publicarLibro(libro1Autor1);
            autor1.publicarLibro(libro2Autor1);

            // Publicar libros para autor2
            Libro libro1Autor2 = new Libro("It", autor2, true);
            Libro libro2Autor2 = new Libro("El resplandor", autor2, true);
            autor2.publicarLibro(libro1Autor2);
            autor2.publicarLibro(libro2Autor2);
        

        //Imprimir información de los autores y sus libros
            System.out.println("\nLos autores han publicado estos libros:");

            System.out.println("\nAutor: " + autor1.getNombre());
            System.out.println("Libros:");
            for (Libro libro : autor1.getListaLibros()) {
                System.out.println("- " + libro.getTitulo());
            }

            System.out.println("\nAutor: " + autor2.getNombre());
            System.out.println("Libros:");
            for (Libro libro : autor2.getListaLibros()) {
                System.out.println("- " + libro.getTitulo());
            }
            System.out.println("--------------------------------------------------");

        //Imprime una lista de todos los libros
            System.out.println("\nLista de todos los libros:");

            for (Libro libro : Libro.getTodosLibros()) {
                System.out.println("\nTítulo: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor().getNombre());
                System.out.println("Disponible: " + (libro.getDisponible() ? "Sí" : "No"));
            }
            System.out.println("--------------------------------------------------");

        //Crea dos usuario
            Usuario usuario1 = new Usuario("Benito");
            System.out.println("\nSe ha creado un usuario nuevo: " + usuario1.getNombre());
            
            Usuario usuario2 = new Usuario("PedroSanxesh");
            System.out.println("\nSe ha creado un usuario nuevo: " + usuario1.getNombre());

        //Crea un miembro premium
            MiembroPremium miembroPremium1 = new MiembroPremium("Pepa");
            System.out.println("Se ha creado un miembro premium nuevo: " + miembroPremium1.getNombre());
            System.out.println("--------------------------------------------------");
      
        // Tomar prestado un libro (si está disponible)
            Libro libroDisponible = Libro.getLibrosDisponibles().get(0); // Tomar el primer libro disponible
            if (libroDisponible != null) {
                usuario1.tomarPrestado(libroDisponible);
            } else {
                System.out.println("No hay libros disponibles para tomar prestados.");
            }
        
        //Usuario2 intenta tomar prestado (con el metodo tomar_prestado mejorado) el libro anterior que no está disponible porque lo tiene prestado usuario1
        
            usuario2.tomar_prestado(libro1Autor1.getTitulo());
            

    }
}

        // Devolver el libro
//            Libro libroPrestado = usuario1.getListaPrestados().get(0); // Tomar el primer libro prestado
//            usuario1.devolverLibro(libroPrestado);
//            System.out.println("--------------------------------------------------");

        //MiembroPremium reserva al menos un libro no disponible.
        
          
            // Buscar un libro no disponible
//                Libro libroNoDisponible = null;
//                List<Libro> todosLibros = Libro.getTodosLibros();
//                for (Libro libro : todosLibros) {
//                    // if () que el nombre del libro exista
//                    if (!libro.getDisponible()) {
//                        libroNoDisponible = libro;
//                        break;
//                    }
//                }
//                // crear varialbe inicializada a false, quando encuentro el libro pasa a true
//                if (libroNoDisponible != null) {
//                    // Reservar el libro no disponible
//                    miembroPremium1.reservarLibro(libroNoDisponible);
//                    System.out.println("El miembro premium " + miembroPremium1.getNombre() + " ha reservado el libro: " + libroNoDisponible.getTitulo());
//                } else {
//                    System.out.println("No hay libros no disponibles para reservar.");
//                }