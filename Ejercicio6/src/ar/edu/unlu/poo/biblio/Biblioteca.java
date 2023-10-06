package ar.edu.unlu.poo.biblio;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<Libro>();

    public void addLibro(Libro libro){
        libros.add(libro);
    }

    public int countPrestados(){
        int prestados = 0;
        for (Libro l: libros){
            prestados += l.getCantidadPrestados();
        }
        return prestados;
    }

    public void getLibrosAutor(String autor){
        for (Libro l: libros){
            if (l.esAutor(autor))
                System.out.println(l);
        }

    }
    public void hayarLibros(String clave){
        for (Libro l: libros){
            if (l.hallar(clave))
                System.out.println(l);
        }

    }
}
