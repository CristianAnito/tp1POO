package ar.edu.unlu.poo.biblio;
import java.util.Arrays;
public class Libro {
    //Propiedades
    private String nombre = "";
    private String[] autores = new String[5];
    private String isbn = "";
    private Integer paginas = 0;
    private Integer cantidadEjemplares = 0;
    private Integer cantidadPrestados = 0;

    //Constructores
    public Libro(String isbn, String nombre) {
        this(isbn, nombre, null);
    }

    public Libro(String isbn, String nombre, String[] listaDeAutores) {
        this(isbn, nombre, listaDeAutores, 0);
    }

    public Libro(String isbn, String nombre, String[] listaDeAutores, int cantidadEjemplaresIniciales) {
        this(isbn, nombre, listaDeAutores, cantidadEjemplaresIniciales, 0);
    }

    public Libro(String isbn, String nombre, String[] listaDeAutores, int cantidadEjemplaresIniciales, int cantidadPaginas) {
        this.setNombre(nombre);
        this.setIsbn(isbn);
        this.setCantidadEjemplares(cantidadEjemplaresIniciales);
        this.setPaginas(cantidadPaginas);
        if (listaDeAutores == null) {
            for (int x = 0;x < autores.length; x ++){
                autores[x] = new String("");
            }
        } else {
            for (String autor : autores) {
                this.setAutor(autor);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getAutores() {
        return autores;
    }

    public boolean setAutor(String autor) {
        // Buscamos el primer autor vacio y lo ponemos allí
        int contadorAutores = 0;
        while (contadorAutores < autores.length && !autores[contadorAutores].equals(""))
            contadorAutores ++;

        if (contadorAutores < autores.length) {
            autores[contadorAutores] = autor;
            return true;
        } else {
            return false;
        }
    }
    public boolean esAutor(String autor){
        return (buscarAutor(autor) > -1);
    }
    public int buscarAutor(String autor) {
        int x = 0;
        autor = autor.toLowerCase();
        while (x < autores.length && !contieneIgnoreCase( autor,autores[x]))
            x++;
        if (x < autores.length) {
            return x;
        } else {
            return -1;
        }
    }
    public boolean hallar(String dato){
        return (contieneIgnoreCase(dato,getIsbn()) ||
                contieneIgnoreCase(dato,getNombre()) ||
                esAutor(dato));
    }

    public static boolean contieneIgnoreCase(String cadena1, String cadena2) {
        // Convertir ambas cadenas a minúsculas para hacer la comparación
        String cadena1Lower = cadena1.toLowerCase();
        String cadena2Lower = cadena2.toLowerCase();

        // Verificar si la cadena2 contiene la cadena1 (ignorando mayúsculas y minúsculas)
        return cadena2Lower.contains(cadena1Lower);
    }


    public boolean removeAutor(String autor) {
        // Buscamos el primer el autor y si está lo vaciamos
        int x = this.buscarAutor(autor);
        if (x >= 0) {
            autores[x] = "";
            return true;
        } else {
            return false;
        }
    }
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Integer getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(Integer cantidadEjemplares) {
        if (cantidadEjemplares > cantidadPrestados)
            this.cantidadEjemplares = cantidadEjemplares;

    }

    public Integer getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void prestarEjemplar() {
        if (this.cantidadPrestados + 1 < this.cantidadEjemplares) {
            cantidadPrestados++;
        } else
            System.out.println("No se pudo prestar un ejemplar, ya que solo se dispone de 1 unidad.");
    }

    public boolean devolverEjemplar() {
        if (this.cantidadPrestados > 0) {
            cantidadPrestados--;
            return true;
        } else
            return false;
    }


    public int getCantidadDisponible() {
        return this.cantidadEjemplares - this.getCantidadPrestados();
    }

    @Override
    public String toString() {
        return "Libro{" +
                "nombre='" + nombre + '\'' +
                ", autores=" + mostrarAutores() +
                ", isbn='" + isbn + '\'' +
                ", paginas=" + paginas +
                ", cantidadEjemplares=" + cantidadEjemplares +
                ", cantidadPrestados=" + cantidadPrestados +
                '}';
    }

    private String mostrarAutores(){
        String respuesta = "";
        for (int x = 0; x < autores.length; x ++) {
            if (!autores[x].equals("")) {
                if (respuesta.length() > 0)
                    respuesta += " - " + autores[x];
                else respuesta += autores[x];
            }
        }
        return respuesta;
    }
}
