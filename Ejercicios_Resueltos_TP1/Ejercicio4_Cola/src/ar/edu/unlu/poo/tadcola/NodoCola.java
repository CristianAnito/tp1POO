package ar.edu.unlu.poo.tadcola;

public class NodoCola {
    private Object datos;
    private NodoCola proximo = null;

    public void setDatos(Object datos) {
        this.datos = datos;
    }

    public void setProximo(NodoCola proximo) {
        this.proximo = proximo;
    }

    public NodoCola getProximo() {
        return proximo;
    }

    public Object getDatos() {
        return datos;
    }
}
