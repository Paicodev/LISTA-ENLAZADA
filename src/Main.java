public class Main {
    public static void main(String[] args) {
       System.out.println("Creando Lista...\n");
       ListaEnlazada listaGordas = new ListaEnlazada();

       listaGordas.mostrarLista();
       System.out.println("En total hay: " + listaGordas.contarElementos() + " elementos \n");
       System.out.println("Agregando primer elemento\n");
        listaGordas.agregarPrimero(1);
        listaGordas.mostrarLista();
        System.out.println("En total hay: " + listaGordas.contarElementos() + " elementos \n");

        System.out.println("\nAgregando segundo elemento\n");
        listaGordas.agregarPrimero(2);
        listaGordas.mostrarLista();
        System.out.println("En total hay: " + listaGordas.contarElementos() + " elementos \n");
        
        System.out.println("\nAgregando tercer elemento\n");
        listaGordas.agregarPrimero(3);
        listaGordas.mostrarLista();
        System.out.println("En total hay: " + listaGordas.contarElementos() + " elementos \n");
    
        System.out.println("\nEJERCICIO 2: Enlazando Nodos\n");

        Nodo n1 = new Nodo("Hola");
        Nodo n2 = new Nodo("Mundo");
        Nodo n3 = new Nodo("!!!");
        n1.setSiguiente(n2);
        n2.setSiguiente(n3);
        System.out.print(n1.getDato() + " "); // devuelve el dato: Hola
        System.out.print(n1.getSiguiente().getDato() + " "); //Devuelve el siguiente: n2, y devuelve, el dato de este
        System.out.print(n1.getSiguiente().getSiguiente().getDato()); //Devuelve el siguiente: n2, que devuelve el siguiente: n3 y devuelve, el dato de este
        //n1.setSiguiente(n2);//

        System.out.println("\n EJERCICIO 4: ");

        System.out.println("En total hay: " + listaGordas.contarElementos() + " elementos \n");

        System.out.println("Buscando si existe "+ 4);
        System.out.println("Resultado: " + listaGordas.existe(4));

        System.out.println("Buscando si existe "+ 1);
        System.out.println("Resultado: " + listaGordas.existe(1));

        System.out.println("Buscando si existe "+ 2);
        System.out.println("Resultado: " + listaGordas.existe(2));

        System.out.println("Lista sin eliminar:");
        listaGordas.mostrarLista();
        System.out.println("\nEliminando: " + 3);
        listaGordas.eliminar(3);
        listaGordas.mostrarLista();
    }
}