import ar.edu.unlu.fechas.Fecha;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Fecha fecha = new Fecha();
        boolean exit = false;
        while (!exit){
            System.out.println("1.\tDevolver una fecha a partir de un string, con un formato específico. Los formatos pueden ser 2:\n" +
                    "    1.\tdd-MM-yyyy\n" +
                    "    2.\tMM-dd-yyyy");
            System.out.println("2.\tDeterminar si una fecha se encuentra entre otras dos fechas.");
            System.out.println("3.\tDeterminar si una fecha es mayor a otra fecha.");
            System.out.println("4.\tDeterminar si una fecha es menor a otra fecha.");
            System.out.println("0. Salir.");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    String fechaIngresada = sc.nextLine();
                    fecha.getFecha(fechaIngresada);
                    break;
                case 2:
                    System.out.println("Ingrese una fecha a verificar: (formato dd-MM-yyyy)");
                    String fecha1 = sc.nextLine();
                    System.out.println("Ingrese la segunda fecha: (mismo formato)");
                    String fecha2 = sc.nextLine();
                    System.out.println("Ingrese la tercera fecha: (mismo formato)");
                    String fecha3 = sc.nextLine();
                    if (fecha.estaEntre(fecha1,fecha2,fecha3)){
                        System.out.println("La fecha 1 esta entre la fecha 2 y la fecha 3.");
                    }else {
                        System.out.println("La fecha 1 no esta entre la fecha 2 y la fecha 3.");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese una fecha a comparar: (formato dd-MM-yyyy)");
                    String fechaMayor1 = sc.nextLine();
                    System.out.println("Ingrese la segunda fecha: (mismo formato)");
                    String fechaMayor2 = sc.nextLine();
                    if (fecha.esMayor(fechaMayor1,fechaMayor2)){
                        System.out.println("La fecha 1 es mayor a la fecha 2");
                    }else {
                        System.out.println("La fecha 1 no es mayor a la fecha 2");
                    }
                    break;
                case 4:
                    System.out.println("Ingrese una fecha a comparar: (formato dd-MM-yyyy)");
                    String fechaMenor1 = sc.nextLine();
                    System.out.println("Ingrese la segunda fecha: (mismo formato)");
                    String fechaMenor2 = sc.nextLine();
                    if (fecha.esMenor(fechaMenor1,fechaMenor2)){
                        System.out.println("La fecha 1 es menor a la fecha 2");
                    }else {
                        System.out.println("La fecha 1 no es menor a la fecha 2");
                    }
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida.");
                    break;
            }
        }
    }
}