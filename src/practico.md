*Ejercicio 1: La Estructura (Memoria Muscular)
Crea desde cero un proyecto nuevo.

Crea la clase Nodo. Debe tener los atributos dato y enlace. Haz un constructor que reciba el dato y ponga el enlace en null.

Crea la clase ListaEnlazada. Debe tener el atributo primero inicializado en null.

Crea un método estaVacia() que devuelva true o false.


Tip: Recuerda que los atributos del Nodo suelen ser protected o de paquete (sin modificador) para que la Lista pueda acceder a ellos fácilmente.*

Ejercicio 2: Enlazado Manual (Entendiendo la "flecha")
En tu clase Main, no uses la clase ListaEnlazada todavía.

Crea 3 objetos Nodo sueltos: n1 con "Hola", n2 con "Mundo", n3 con "!".

Enlázalos manualmente: haz que el enlace de n1 apunte a n2, y el de n2 apunte a n3.

Imprime el dato del tercer nodo accediendo solamente a través de n1 (ej. System.out.println(n1.enlace...???)).

Tip: Esto te enseña que la lista es solo una cadena de referencias. Si tienes al primero (n1), tienes a todos.

Ejercicio 3: El Gerente entra en acción (Inserción LIFO)
Ahora sí, ve a tu clase ListaEnlazada.

Implementa el método void insertarAlPrincipio(Object dato).

Implementa el método void verLista() para probarlo.

En el Main, inserta los números 1, 2 y 3. Al mostrar la lista, ¿en qué orden salen? (Deberían salir 3 -> 2 -> 1).

Tip para insertar: Recuerda el orden: 1. Creas nodo. 2. Nuevo apunta al antiguo primero. 3. El primero ahora es el nuevo.

Ejercicio 4: Recorrido y Búsqueda
En tu clase ListaEnlazada, implementa un método que devuelva algo, no solo void.

Crea el método int contarElementos(). Debe recorrer la lista y devolver cuántos nodos hay.

Crea el método boolean existe(Object dato). Devuelve true si encuentra el dato, false si no.

Tip: Usa el "bucle sagrado" que te puse arriba. Para comparar objetos usa .equals(), no == (importante para Strings y objetos propios).

Ejercicio 5: El "Jefe Final" (Eliminar)
Este es el que suele caer en los parciales porque requiere manejar dos punteros (actual y anterior).

Implementa void eliminar(Object dato).

Casos que debe cubrir tu código:

Borrar el primer elemento (se mueve primero).

Borrar un elemento del medio (el anterior salta al siguiente del actual).

Que la lista esté vacía o el dato no exista (no romperse).

Tip: Necesitas un Nodo anterior = null y un Nodo actual = primero. Avanzas los dos juntos. Si borras, haces anterior.enlace = actual.enlace.


hacete culea fujilos beso?

