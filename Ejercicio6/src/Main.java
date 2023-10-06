import ar.edu.unlu.poo.biblio.Biblioteca;
import ar.edu.unlu.poo.biblio.Libro;

/*
Necesitamos implementar la clase Libro para un sistema de administración de bibliotecas. Generalmente las búsquedas se hacen por Título o Autor,
es casi imposible que quieran buscar un libro por ISBN y en ciertos casos no se tiene el dato para completarlo. Si solo queda un ejemplar disponible,
no se puede prestar el libro porque tiene que quedar disponible para consultar dentro de la biblioteca. El sistema debería mostrar la descripción
del libro como: El libro <su_titulo> creado por el autor <su_autor> tiene <num_paginas> páginas, quedan <num_ejemplares> disponibles y
se prestaron <num_ejemplares_prestados>. También se necesita determinar la cantidad de préstamos realizados, teniendo en cuenta todos los libros disponibles.

Objetivos:
1.	Definir estructura y comportamiento.
2.	Crear una clase que utilice a la anterior y que cree 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla e indique cuál de los 2 tiene más páginas.
3.	Intentar prestar un libro con 10 ejemplares y uno con 1 solo ejemplar.
4.	Mostrar cantidad total hecha de préstamos.

 */
public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro("0001", "Mi primer libro");
        l1.setAutor("Autor 1");
        l1.setPaginas(200);
        l1.setAutor("Autor 2");
        l1.setAutor("Autor 3");
        l1.setAutor("Autor 4");
        l1.setCantidadEjemplares(10);
        System.out.println(l1);

        Biblioteca bi = new Biblioteca();
        bi.addLibro(l1);
        // -- segundo libro
        Libro l2 = new Libro("0002", "Mi segundo libro");
        l2.setAutor("Autor 1");
        l2.setPaginas(100);
        l2.setAutor("Autor 2");
        l2.setAutor("Autor 3");
        l2.setCantidadEjemplares(1);
        System.out.println(l2);
        bi.addLibro(l2);

        if (l1.getPaginas() > l2.getPaginas()){
            System.out.println("El libro 1 tiene mayor cantidad de paginas que el libro 2");
        }else {
            if (l1.getPaginas() < l2.getPaginas()) {
                System.out.println("El libro 2 tiene mayor cantidad de paginas que el libro 1");
            } else {
                System.out.println("Igual cantidad de paginas.");
            }
        }

        l1.prestarEjemplar();
        l2.prestarEjemplar();
        System.out.println("Prestados : " + bi.countPrestados());
    }
}