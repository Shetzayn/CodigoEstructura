public class Main {

    public static void main(String[] argumentos) {

        // raiz
        Nodo nodoInicial = new Nodo(null, null, 10);

        // inst
        Arbol arbolBusqueda = new Arbol(nodoInicial);

        // insert
        arbolBusqueda.insertar(15);
        arbolBusqueda.insertar(5);
        arbolBusqueda.insertar(12);
        arbolBusqueda.insertar(1);
        arbolBusqueda.insertar(7);
        arbolBusqueda.insertar(20);

        // in
        System.out.println("Recorrido en Inorden:");
        arbolBusqueda.mostrarInOrder(nodoInicial);
        System.out.println();

        // pre
        System.out.println("Recorrido en Preorden:");
        arbolBusqueda.mostrarPreOrder(nodoInicial);
        System.out.println();

        // pos
        System.out.println("Recorrido en Postorden:");
        arbolBusqueda.mostrarPostOrder(nodoInicial);
        System.out.println();
    }
}
