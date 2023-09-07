import ar.edu.unlu.poo.task.ListaTarea;
import ar.edu.unlu.poo.task.Tarea;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException, IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
        ListaTarea myList = new ListaTarea();
        boolean exit = false;

        myList.agregarTarea("terminar tarea de poo", 3, fecha.parse("07/09/2023"),fecha.parse("06/09/2023"), false, new String[]{"cristian", "Belen", "Camila"});
        myList.agregarTarea("ir al super", 1, fecha.parse("05/09/2023"),fecha.parse("04/09/2023"), false, new String[]{"cristian", "Camila"});
        myList.agregarTarea("terminar tp 2 de poo", 2, fecha.parse("27/09/2023"),fecha.parse("25/09/2023"), false, new String[]{"Belen", "Pablo"});
        myList.agregarTarea("hacer el resumen de Aygr", 1, fecha.parse("12/09/2023"),fecha.parse("10/09/2023"), false, new String[]{"cristian"});

        while (!exit){
            //System.out.println("1: Agregar tarea");
            System.out.println("2: Mostrar tareas");
            System.out.println("3: Modificar tarea");
            System.out.println("4: Verificar estado");
            System.out.println("5: Buscar tarea por titulo");
            System.out.println("6: Mostrar tareas no vencidas");
            System.out.println("7: Mostrar tareas realizadas por un colaborador");
            System.out.println("0: Salir");

            int opcion = sc.nextInt();
            sc.nextLine();  // Consumir el salto de línea

            switch (opcion) {
                /*
                case 1:
                    System.out.println("Ingrese la descripcion de la tarea: ");
                    String descripcion = sc.nextLine();
                    System.out.println("Ingrese la fecha de vencimiento (formato: dd/mm/yyyy): ");
                    String dueDate = sc.nextLine();
                    Date fechaV = fecha.parse(dueDate);
                    System.out.println("Ingrese la fecha de recordatorio (formato: dd/mm/yyyy): ");
                    String recorDate = sc.nextLine();
                    Date fechaRecordatorio = fecha.parse(recorDate);
                    System.out.println("Ingrese la prioridad (1- bajo, 2- medio, 3- alto): ");
                    int priori = sc.nextInt();

                    myList.agregarTarea(descripcion, priori, fechaV, fechaRecordatorio, false);
                    System.out.println("Tarea agregada correctamente.");
                    break;

                 */
                case 2:
                    myList.mostrarTareas();
                    break;
                case 3:
                    System.out.println("Ingresa la tarea a modificar (Indice): ");
                    int indice = sc.nextInt();

                    Tarea tareaAModificar = myList.getTarea(indice);

                    boolean salir = false;
                    while (!salir){
                        System.out.println("1: Modificar Descripcion ");
                        System.out.println("2: Modificar Prioridad ");
                        System.out.println("3: Modificar Estado a 'Completado' ");
                        System.out.println("0: Salir");

                        int eleccion = sc.nextInt();
                        sc.nextLine();

                        switch (eleccion){
                            case 1:
                                System.out.println("Ingrese la descripcion: ");
                                String nuevaDes = sc.nextLine();
                                myList.modificarDescripcion(tareaAModificar,nuevaDes);
                                break;
                            case 2:
                                System.out.println("Ingrese la prioridad (1- bajo, 2- medio, 3- alto): ");
                                int nuevaPriori = sc.nextInt();
                                myList.modificarPrioridad(tareaAModificar,nuevaPriori);
                                break;
                            case 3:
                                myList.modificarEstado(tareaAModificar,true);
                                break;
                            case 0:
                                salir = true;
                                break;
                            default:
                                System.out.println("Opcion invalida");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Ingresa la tarea a verificar (Indice): ");
                    int index = sc.nextInt();
                    Tarea tareaAVerificar = myList.getTarea(index);
                    myList.verificarTarea(tareaAVerificar);
                    break;
                case 5:
                    System.out.println("Ingrese el titulo: ");
                    String titulo = sc.nextLine();
                    myList.buscarTareas(titulo);
                    break;
                case 6:
                    myList.getListaTareasNoVencidas();
                    break;
                case 7:
                    System.out.println("Ingrese el colaborador: ");
                    String nombreColaborador = sc.nextLine();
                    myList.realizoTareas(nombreColaborador);
                    break;
                case 0:
                    exit = true;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        }
    }
}