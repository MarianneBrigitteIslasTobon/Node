/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package node;

import java.util.LinkedList;

/**
 *
 * @author kirin
 */

public class Nodo {
private double valor;
    private Nodo siguiente;

    public Nodo(double valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
//tda de una pila que es atributos, operaciones