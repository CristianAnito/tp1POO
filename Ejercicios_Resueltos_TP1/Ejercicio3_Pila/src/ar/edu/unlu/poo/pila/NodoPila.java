package ar.edu.unlu.poo.pila;

public class NodoPila {
    private Object datos;
    private NodoPila proximo = null;

    public void setDatos(Object datos) {
        this.datos = datos;
    }

    public void setProximo(NodoPila proximo) {
        this.proximo = proximo;
    }

    public NodoPila getProximo() {
        return proximo;
    }

    public Object getDatos() {
        return datos;
    }
}
