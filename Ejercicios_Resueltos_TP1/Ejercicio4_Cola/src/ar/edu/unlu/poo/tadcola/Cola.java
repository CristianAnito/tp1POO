package ar.edu.unlu.poo.tadcola;

public class Cola {
    private NodoCola inicio, fin;
    private int size;
    private int items;
    private final int min = 0;
    private final int max = 1000;

    public void crear(int tam){
        if ((tam >= min) && (tam <= max)){
            inicio = null;
            fin = null;
            size = tam;
            items = 0;
        }else {
            System.out.println("Ingrese un tamaño dentro del rango 0-1000");
        }
    }

    public Boolean esVacia(){
        return inicio == null;
    }

    public Boolean esLlena(){
        return items == size;
    }

    public Object recuperar(){
        return inicio.getDatos();
    }

    public void encolar(Object dato){
        NodoCola nuevoInicio = new NodoCola();
        nuevoInicio.setDatos(dato);
        if (esLlena()){
            System.out.println("Cola llena");
        }else {
            if (esVacia()){
                inicio = nuevoInicio;
                fin = nuevoInicio;
            }else {
                fin.setProximo(nuevoInicio);
                fin = nuevoInicio;
            }
            items++;
        }
    }

    public Object desencolar(){
        if (esVacia()){
            return null;
        }
        NodoCola viejoInicio = inicio;
        inicio = viejoInicio.getProximo();
        items--;
        return viejoInicio.getDatos();
    }

    public void intercambiar(Cola colaAux, Boolean bCrearV){
        Object valor;
        if (bCrearV){
            crear(size);
        }
        while (!colaAux.esVacia()){
            valor = colaAux.recuperar();
            encolar(valor);
            colaAux.desencolar();
        }
    }

}
