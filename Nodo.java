

public class Nodo {

    private Nodo izquierda;
    private Nodo derecha;
    private int valor;

    public Nodo(Nodo izquierda, Nodo derecha, int valor) {
        super();
        this.izquierda = izquierda;
        this.derecha = derecha;
        this.valor = valor;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

}
