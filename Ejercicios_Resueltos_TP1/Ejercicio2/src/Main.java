import ar.edu.unlu.poo.lista.ListaEnlazadaDoble;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
        Scanner sc = new Scanner(System.in);

        System.out.println("Se creara la lista, introduzca su tamaño: ");
        int tamanio = sc.nextInt();
        lista.crear(tamanio);
        //if (lista.esVacia())
        //    System.out.println("Lista vacia");
        System.out.println("Longitud de la Lista: " + lista.longitud());

        System.out.print("Ingresa los datos para cargar en la lista (presiona 0 para salir): \n");
        String salida = sc.nextLine();
        while (!salida.equals("0")) {
            salida = sc.nextLine();
            if (!salida.equals("0")){
                lista.agregar(salida);
            }
        }
        System.out.println(lista.toString());
        /*
        System.out.println("Ingrese la posicion del elemento a recuperar: ");
        int posRecup = sc.nextInt();
        System.out.println("Recupero el elemento en la posicion " + posRecup + ": " + lista.recuperar(posRecup));

         */
        System.out.println("Ingrese el dato a ser insertado: ");
        Object datoIn = sc.next();
        System.out.println("Ingrese la posicion donde sera insertado: ");
        int posIn = sc.nextInt();
        lista.insertar(datoIn, posIn);
        /*
        System.out.println("Ingrese la posicion del elemento a eliminar: ");
        int posElim = sc.nextInt();
        lista.eliminar(posElim);

         */
        System.out.println(lista.toString());
    }
}