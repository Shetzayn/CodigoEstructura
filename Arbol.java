

public class Arbol {

    private Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo crear(int numero) {
        Nodo nuevo = new Nodo(null,null,numero);
        return nuevo;
    }

    public void insertar(int valor) {
        insertarNodo(raiz,valor);
    }

    private Nodo insertarNodo(Nodo indice, int valor) {

        if(indice == null) {
            Nodo nuevo = new Nodo(null,null,valor);
            return nuevo;
        }
        if (valor < indice.getValor()) {
            indice.setIzquierda(insertarNodo(indice.getIzquierda(), valor));
        }
        else if(valor > indice.getValor()) {
            indice.setDerecha(insertarNodo(indice.getDerecha(), valor));
        }
        else {
            System.out.println("No se ha podido agregar.");
        }
        return indice;
    }

    public void mostrarInOrder(Nodo indice) {
        if(indice == null) {
            return;
        }
        mostrarInOrder(indice.getIzquierda());
        System.out.println(indice.getValor());
        mostrarInOrder(indice.getDerecha());
    }

    public void mostrarPreOrder(Nodo indice) {
        if(indice == null) {
            return;
        }
        System.out.println(indice.getValor());
        mostrarPreOrder(indice.getIzquierda());
        mostrarPreOrder(indice.getDerecha());
    }

    public void mostrarPostOrder(Nodo indice) {
        if(indice == null) {
            return;
        }
        mostrarPostOrder(indice.getIzquierda());
        mostrarPostOrder(indice.getDerecha());
        System.out.println(indice.getValor());
    }

}
