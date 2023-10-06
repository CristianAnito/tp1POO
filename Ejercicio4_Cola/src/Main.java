import ar.edu.unlu.poo.tadcola.Cola;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner sc = new Scanner(System.in);

        System.out.println("Se creara la Cola, introduzca su tamaño: ");
        int tamanio = sc.nextInt();
        cola.crear(tamanio);
        if (cola.esVacia())
            System.out.println("Cola vacia");

        System.out.print("Ingresa los datos para cargar en la Cola (presiona 0 para salir): \n");
        String salida = sc.nextLine();
        while (!salida.equals("0")) {
            salida = sc.nextLine();
            if (!salida.equals("0")){
                cola.encolar(salida);
            }
        }

        int i = 1;
        while (!cola.esVacia()){
            System.out.println("Nodo " + i + ": " + cola.desencolar());
            i++;
        }
    }
}