import ar.edu.unlu.poo.pila.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner sc = new Scanner(System.in);

        System.out.println("Se creara la Pila, introduzca su tamaño: ");
        int tamanio = sc.nextInt();
        pila.crear(tamanio);
        if (pila.esVacia())
            System.out.println("Pila vacia");

        System.out.print("Ingresa los datos para cargar en la Pila (presiona 0 para salir): \n");
        String salida = sc.nextLine();
        while (!salida.equals("0")) {
            salida = sc.nextLine();
            if (!salida.equals("0")){
                pila.apilar(salida);
            }
        }

        if (!pila.esVacia()){
            System.out.println("La pila contiene datos, su tope es: " + pila.recuperar());
        }else {
            System.out.println("Error");
        }

        int i = 1;
        while (!pila.esVacia()){
            System.out.println("Nodo " + i + ": " + pila.desapilar());
            i++;
        }
    }
}