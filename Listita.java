package node;

    import java.util.Iterator;
import java.util.NoSuchElementException;


public class Listita {
    Nodo cabeza;

    public Listita() {
        this.cabeza = null;
    }

    public void agregar(double valor) {
        Nodo nuevo = new Nodo(valor);
        if (this.cabeza == null) {
            this.cabeza = nuevo;
        } else {
            Nodo actual = this.cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public void imprimir() {
        Nodo actual = this.cabeza;
        while (actual != null) {
            System.out.print(actual.getValor() + " ");
            actual = actual.getSiguiente();
        }
        System.out.println();
    }

    public void ordenar() {
        if (this.cabeza == null) {
            return;
        }
        Nodo actual = this.cabeza;
        Nodo siguiente = null;
        double temp;
        while (actual != null) {
            siguiente = actual.getSiguiente();
            while (siguiente != null) {
                if (actual.getValor() > siguiente.getValor()) {
                    temp = actual.getValor();
                    actual.setValor(siguiente.getValor());
                    siguiente.setValor(temp);
                }
                siguiente = siguiente.getSiguiente();
            }
            actual = actual.getSiguiente();
        }
    }

    public void eliminar(double valor) {
        if (this.cabeza == null) {
            return;
        }
        if (this.cabeza.getValor() == valor) {
            this.cabeza = this.cabeza.getSiguiente();
            return;
        }
        Nodo actual = this.cabeza;
        while (actual.getSiguiente() != null) {
            if (actual.getSiguiente().getValor() == valor) {
                actual.setSiguiente(actual.getSiguiente().getSiguiente());
                return;
            }
            actual = actual.getSiguiente();
        }
    }
}

//TDA CREAR Y VIZUALIZA 