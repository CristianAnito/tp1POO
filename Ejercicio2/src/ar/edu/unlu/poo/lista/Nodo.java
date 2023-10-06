package ar.edu.unlu.poo.lista;

public class Nodo {
    // atributos de la clase

    private Object dato;
    private Nodo anterior = null;
    private Nodo proximo = null;

    // comportamiento publico de la clase

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getProximo() {
        return proximo;
    }
}
