package ar.edu.unlu.poo.pila;

public class Pila {
    private NodoPila tope;
    private int size;
    private int items;
    private final int min = 0;
    private final int max = 1000;

    public void crear(int tam){
        if ((tam >= min) && (tam <= max)){
            tope = null;
            size = tam;
            items = 0;
        }else {
            System.out.println("Ingrese un tamaño dentro del rango 0-1000");
        }
    }

    public Boolean esVacia(){
        return tope == null;
    }

    public Boolean esLlena(){
        return items == size;
    }

    public Object recuperar(){
        return tope.getDatos();
    }

    public void apilar(Object dato){
        NodoPila nuevoTope = new NodoPila();
        nuevoTope.setDatos(dato);
        if (esLlena()){
            System.out.println("Pila llena");
        }else {
            if (esVacia()){
                tope = nuevoTope;
            }else {
                nuevoTope.setProximo(tope);
                tope = nuevoTope;
            }
            items++;
        }
    }

    public Object desapilar(){
        if (esVacia()){
            return null;
        }
        NodoPila viejoTope = tope;
        tope = viejoTope.getProximo();
        items--;
        return viejoTope.getDatos();
    }

    public void intercambiar(Pila pilaAux, Boolean bCrearV){
        Object valor;
        if (bCrearV){
            crear(size);
        }
        while (!pilaAux.esVacia()){
            valor = pilaAux.recuperar();
            apilar(valor);
            pilaAux.desapilar();
        }
    }
}
