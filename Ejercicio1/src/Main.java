import ar.edu.unlu.poo.lista.ListaEnlazada;
import ar.edu.unlu.poo.lista.Nodo; //importo el paquete completo mas el nombre de la clase a utilizar,

import java.util.Scanner;
// si utilizo un * importo todas las clases.

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Intro with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        //System.out.println("Hello and welcome!");
/*
        // Press Mayús+F10 or click the green arrow button in the gutter to run the code.
        for (int valor = 1; valor <= 5; valor++) {

            // Press Mayús+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("Hello " + valor);
        }

 */
     /*   Nodo miNodo = new Nodo(); // Creo un objeto llamado miNodo de tipo Nodo(Clase)
        miNodo.setDato("Hola brou");
        System.out.println(miNodo.getDato());

        •	Crear lista.
        •	Consultar si la lista está vacía.
        •  	Consultar la longitud de la lista.
        •	Agregar elemento al final de la lista.
        •	Eliminar elemento de la lista.
        •	Recuperar elemento de la lista.
        •	Insertar elemento en la lista en una posición específica.


      */
        ListaEnlazada lista = new ListaEnlazada();
        Scanner sc = new Scanner(System.in);

        System.out.println("Se creara la lista, introduzca su tamaño: ");
        int tamanio = sc.nextInt();
        lista.crear(tamanio);
        //if (lista.esVacia())
        //    System.out.println("Lista vacia");
        System.out.println("Longitud de la Lista: " + lista.longitud());

        System.out.print("Ingresa los datos para cargar en la lista (presiona 0 para salir): ");
        String salida = sc.nextLine();
        while (!salida.equals("0")) {
            salida = sc.nextLine();
            if (!salida.equals("0")){
                lista.agregar(salida);
            }
        }
        System.out.println("Ingrese la posicion del elemento a recuperar: ");
        int posRecup = sc.nextInt();
        System.out.println("Recupero el elemento en la posicion " + posRecup + ": " + lista.recuperar(posRecup));
        System.out.println(lista.toString());
        System.out.println("Ingrese el dato a ser insertado: ");
        Object datoIn = sc.next();
        System.out.println("Ingrese la posicion donde sera insertado: ");
        int posIn = sc.nextInt();
        lista.insertar(datoIn, posIn);
        //lista.eliminar(3);
        System.out.println(lista.toString());
    }
}