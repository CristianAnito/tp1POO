package ar.edu.unlu.poo.task;

import java.util.*;

public class ListaTarea {
    private List<Tarea> listTasks = new ArrayList<Tarea>();;
    // List<Tarea> indica que listaDeTarea es una lista que contiene elementos de tipo Tarea.
    // ArrayList<Tarea>() es una implementación concreta de la interfaz List que se utiliza aquí. Indica que estás utilizando un ArrayList para almacenar elementos tipo Tarea.

    public void agregarTarea(String description, int prioridad, Date fechaVenc, Date fechaRecor, Boolean estado, String[] colaboradores){
        Tarea task = new Tarea();
        task.setDescripcion(description);
        task.setEstado(estado);
        task.setPrioridad(prioridad);
        task.setFechaVencimiento(fechaVenc);
        task.setFechaRecordatorio(fechaRecor);
        task.setColaboradores(colaboradores);
        listTasks.add(task);
    }

    public void mostrarTareas(){
        for (Tarea task : listTasks) {
            System.out.println(task.getDescripcion());
        }
    }

    public Integer cantElementos(){
        return listTasks.size();
    }

    public Tarea getTarea(int indice){
        return listTasks.get(indice - 1);
    }

    public void verificarTarea(Tarea tarea){
        Date fechaActual = new Date();
        Date fechaTarea = tarea.getFechaVencimiento();
        boolean estadoTask = tarea.getEstado();

        if (fechaTarea.before(fechaActual) && !estadoTask){
            System.out.println("Tarea vencida");
        }else {
            if (estadoTask){
                System.out.println("Tarea completada");
            }else {
                System.out.println("Tarea incompleta");
                recordatorio(tarea);
            }
        }
    }

    private void recordatorio(Tarea tarea){
        Date fechaActual = new Date();
        Date fechaVencimiento = tarea.getFechaVencimiento();
        Date fechaRecordatorio = tarea.getFechaRecordatorio();

        if ((fechaRecordatorio.before(fechaActual) || fechaRecordatorio.equals(fechaActual) && (fechaVencimiento.before(fechaRecordatorio) || fechaVencimiento.equals(fechaRecordatorio))) ){
            System.out.println("(por vencer) " + tarea.getDescripcion() + " - Fecha de vencimiento: " + fechaVencimiento);
            tarea.setPrioridad(3);
        }
    }

    public void modificarDescripcion(Tarea task, String descripcion){
        task.setDescripcion(descripcion);
    }

    public void modificarEstado(Tarea task, Boolean estado){
        Date fechaActual = new Date();
        Scanner sc = new Scanner(System.in);
        String[] colaboradores = task.getColaboradores();

        task.setEstado(estado); //Registro la tarea como completada
        task.setFechaFinalizacion(fechaActual); //Registro la fecha en la que se completo la tarea

        System.out.println("Quien realizo la tarea? ");
        for (String colaborador:
             colaboradores) {
            System.out.println(colaborador);
        }
        String nombre = sc.nextLine();
        for (String colaborador:
                colaboradores) {
            if (nombre.equalsIgnoreCase(colaborador)){
                task.setColaboradorFinalizo(nombre); //Registro el colaborador que realizo la tarea
                break;
            }else {
                System.out.println("No es colaborador.");
            }
        }
    }

    public void modificarPrioridad(Tarea task, int prioridad){
        task.setPrioridad(prioridad);
    }

    public void buscarTareas(String titulo){
        for (Tarea task: listTasks) {
            if (task.getDescripcion().toLowerCase().contains(titulo.toLowerCase())){
                System.out.println("Tarea: " + task.getDescripcion());
            }
        }
    }

    public void getListaTareasNoVencidas(){
        List<Tarea> listaTareasNoVencidas = new ArrayList<>();
        Date fechaActual = new Date();
        Date fechaVen;

        for (Tarea tarea : listTasks) {
            fechaVen = tarea.getFechaVencimiento();
            if (fechaVen.after(fechaActual)){
                listaTareasNoVencidas.add(tarea);
            }
        }

        ordenarPorPrioridad(listaTareasNoVencidas);
        ordenarPorDueDate(listaTareasNoVencidas);

        for (Tarea tarea:
             listaTareasNoVencidas) {
            System.out.println("Descripcion: " + tarea.getDescripcion() + " - Prioridad: " + tarea.getPrioridad() + " - Fecha de vencimiento: " + tarea.getFechaVencimiento());
        }
    }

    private void ordenarPorPrioridad(List<Tarea> listTaskDue){
        // Ordenar la lista de tareas por prioridad usando un comparador personalizado
        listTaskDue.sort(new Comparator<Tarea>() {
            @Override
            public int compare(Tarea tarea1, Tarea tarea2) {
                return Integer.compare(tarea1.getPrioridad(), tarea2.getPrioridad());
            }
        });
    }

    private void ordenarPorDueDate(List<Tarea> listTasksDue){
        listTasksDue.sort(new Comparator<Tarea>() {
            @Override
            public int compare(Tarea tarea1, Tarea tarea2) {
                return tarea1.getFechaVencimiento().compareTo(tarea2.getFechaVencimiento());
            }
        });
    }

    public void realizoTareas(String colaborador){
        List<String> listaColaborador = new ArrayList<>();
        for (Tarea task : listTasks) {
            if (task.getEstado()){
                String colaboradorFinalizo = task.getColaboradorFinalizo();
                if (colaborador.equals(colaboradorFinalizo)){
                    listaColaborador.add(task.getDescripcion());
                }
            }
        }

        if (!listaColaborador.isEmpty()){
            for (String tareaDescripcion : listaColaborador) {
                System.out.println(tareaDescripcion);
            }
        }else {
            System.out.println("El colaborador no tiene ninguna tarea asignada o no realizo ninguna tarea.");
        }
    }
}
