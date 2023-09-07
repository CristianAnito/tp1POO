import ar.edu.unlu.poo.ecuacionsg.EcuacionSG;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------Calculo de una Ecuacion de Segundo grado (y = ax^2 + bx + c)------------");
        System.out.println(" ");
        System.out.println("Ingrese los valores de x si desea calcular el valor de y (Enter si no desea ingresar nada): ");
        System.out.println("Valor de X1");
        String x1 = sc.nextLine();
        System.out.println("Valor de X2");
        String x2 = sc.nextLine();
        System.out.println("Ingrese los coeficientes de la ecuacion: ");
        System.out.println("Coeficiente a: ");
        double c1 = sc.nextDouble();
        System.out.println("Coeficiente b: ");
        double c2 = sc.nextDouble();
        System.out.println("Coeficiente c: ");
        double c3 = sc.nextDouble();
        EcuacionSG ecuacion = new EcuacionSG(c1,c2,c3);
        if (x1.isEmpty() && x2.isEmpty()){
            ecuacion.calcularRaices();
        }else {
            System.out.println("El valor de y es: " + ecuacion.calcularResultado(x1,x2));
        }
    }
}