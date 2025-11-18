public class ListaEnlazada {
    //atributo
    private Nodo cabeza;

    
    //constructor
    public ListaEnlazada(){
        this.cabeza = null;
    }

    //metodos propios
    public void agregarPrimero(Object dato){
        //nuevo es un nodo auxiliar
        Nodo nuevo = new Nodo(dato);
        //se crea el nodo con un dato y sigueinte null
        nuevo.setSiguiente(this.cabeza);
        // //nuevo.setSiguiente(cabeza);
        this.cabeza = nuevo;
        // cabeza = nuevo;
        // cabeza = nuevo.getSiguiente();
    }

    public boolean estaVacia(){
        
        return this.cabeza == null;
        
    }

    public void mostrarLista(){
        
       //copia de la cabeza
        Nodo actual = this.cabeza;
        //  8=====D >°) //
        //↑la que te comes↑

       while(actual != null){
        System.out.print(" "+ actual.getDato() + " ->");
        actual = actual.getSiguiente();
       }

       if(estaVacia()){
            System.out.println("Lista vacia.");
        }
       System.out.print(" null");
       
    }

/*Ejercicio 4: Recorrido y Búsqueda
En tu clase ListaEnlazada, implementa un método que devuelva algo, no solo void.

Crea el método int contarElementos(). Debe recorrer la lista y devolver cuántos nodos hay.

Crea el método boolean existe(Object dato). Devuelve true si encuentra el dato, false si no.

Tip: Usa el "bucle sagrado" que te puse arriba. Para comparar objetos usa .equals(), no == (importante para Strings y objetos propios).*/

    public int contarElementos(){
        int cantidad = 0;
        Nodo actual = this.cabeza;
        while(actual != null){
            cantidad++;
            actual = actual.getSiguiente();
            
        }
        return cantidad;
    }

    public boolean existe(Object buscado){
        Nodo actual = this.cabeza;

        while(actual!=null){
            if(actual.getDato().equals(buscado)){
                return true;
            }
            actual = actual.getSiguiente();
        }

        return false;
    }

    public void eliminar(Object eliminar){
        Nodo actual = this.cabeza;
        Nodo anterior = null;

        if(estaVacia()){
            System.out.println("No hay elementos");
            return;
        }
        if(!existe(eliminar)){
            System.out.println("no existe dicho elemento");
            return;
        }
        while(actual != null){
            if(actual.getDato().equals(eliminar)){
                //caso A: El nodo a eliminar es la CABEZA
                if(actual == this.cabeza){
                    this.cabeza = actual.getSiguiente();
                    return;
                }else{
                    anterior.setSiguiente(actual.getSiguiente());
                    //MAL: no lo hago null, tengo que hacer que nadie apunte a actual, -> X actual = null;
                return;
                }
                
            }
            anterior = actual;
            actual = actual.getSiguiente();
            
        }
        
    }
    /*Ejercicio 5: El "Jefe Final" (Eliminar)
   Este es el que suele caer en los parciales porque requiere manejar dos punteros (actual y anterior).

   Implementa void eliminar(Object dato).

   Casos que debe cubrir tu código:

   Borrar el primer elemento (se mueve primero).

  Borrar un elemento del medio (el anterior salta al siguiente del actual).

  Que la lista esté vacía o el dato no exista (no romperse).

  Tip: Necesitas un Nodo anterior = null y un Nodo actual = primero. Avanzas los dos juntos. Si borras, haces anterior.enlace = actual.enlace.*/


    /* Codigo erroneo public boolean existe(Object dato){
        Nodo actual = this.cabeza;
        while(actual!= null){
            if(actual.equals(dato)){
                
            }else {
                actual = actual.getSiguiente();
            }
            
        }
    }*/
}
//