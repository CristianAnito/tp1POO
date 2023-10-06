package ar.edu.unlu.poo.lista;

public class ListaEnlazadaDoble {
    private Nodo primero, ultimo;
    private int items;
    private int size;
    static final int max = 1000;
    static final int min = 1;

    public void crear(int tamanio) {
        if ((tamanio > max) || (tamanio < min)) {
            System.out.println("Ingrese un tamaño entre 0 y 1000");
        }else {
            primero = null;
            ultimo = null;
            size = tamanio;
            items = 0;
            System.out.println("Lista creada");
        }
    }
    public Boolean esVacia(){
        return primero == null;
    }
    public Boolean esLlena(){
        return items == size - 1;
    }
    public Integer longitud(){
        return size;
    }
    public void agregar(Object dato) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        nuevoNodo.setProximo(null);
        nuevoNodo.setAnterior(ultimo);
        if (esLlena()){
            System.out.println("Lista llena");
        }else {
            if (esVacia()) {
                primero = nuevoNodo;
                ultimo = nuevoNodo;
            } else {
                Nodo nodoAux = primero;
                while (nodoAux.getProximo() != null) {
                    nodoAux = nodoAux.getProximo();
                }
                nodoAux.setProximo(nuevoNodo);
                nuevoNodo.setAnterior(nodoAux);
                ultimo = nuevoNodo;
            }
            items++;
        }
    }

    public void eliminar(int nodoEliminar){
        int i = 1;
        Nodo nodoAux = primero;
        //Nodo nodoPrev = null;
        if (esVacia()){
            System.out.println("Lista vacia");
        }else {
            if (nodoEliminar > size) {
                System.out.println("fuera del tamaño de la lista");
            }else {
                if ((nodoEliminar == 1) && (nodoAux.getProximo() == null)){
                    crear(size);
                }else {
                    if(nodoEliminar == 1) {
                        primero = primero.getProximo();
                        primero.setAnterior(null);

                    }else {
                        if (nodoEliminar == items) {
                            ultimo = ultimo.getAnterior();
                            ultimo.setProximo(null);
                        } else {
                            while (nodoEliminar != i) {
                                nodoAux = nodoAux.getProximo();
                                i++;
                            }
                            nodoAux.getAnterior().setProximo(nodoAux.getProximo());
                            nodoAux.getProximo().setAnterior(nodoAux.getAnterior());
                        }
                    }
                }
                items--;
            }
        }
    }

    public Object recuperar(int posicion){
        Nodo nodoAux = primero;
        int i = 1;
        while (posicion != i){
            nodoAux = nodoAux.getProximo();
            i++;
        }
        return nodoAux.getDato();
    }

    public void insertar(Object dato, int posicion) {
        Nodo nuevoNodo = new Nodo();
        nuevoNodo.setDato(dato);
        if (esLlena()){
            System.out.println("Lista llena");
        }else {
            if (esVacia()) {
                primero = nuevoNodo;
            } else {
                int i = 1;
                Nodo nodoAux = primero;
                while (posicion != i) {
                    nodoAux = nodoAux.getProximo();
                    i++;
                }
                nuevoNodo.setAnterior(nodoAux.getAnterior());
                nuevoNodo.setProximo(nodoAux);

                nodoAux.getAnterior().setProximo(nuevoNodo);
                nodoAux.setAnterior(nuevoNodo);
            }
            items++;
        }
    }

    public String toString() {
        String acumula = "";
        int i = 1;
        Nodo nodoAux = primero;
        if (esVacia()) {
            acumula = "Lista vacia";
        }else {
            while (nodoAux != null) {
                acumula += "Nodo " + i + " " + nodoAux.getDato() + "\n";
                i++;
                nodoAux = nodoAux.getProximo();         // Paso al siguiente nodo
            }
        }
        return acumula;
    }
}
