package ar.edu.unlu.poo.lista;
//unit = class
public class Nodo {
    // atributos de la clase

    private Object dato;
    private Nodo proximo = null;

    // comportamiento publico de la clase

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public Object getDato() {
        return dato;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }

    public Nodo getProximo() {
        return proximo;
    }
}
