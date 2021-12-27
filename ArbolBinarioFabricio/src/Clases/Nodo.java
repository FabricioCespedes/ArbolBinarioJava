/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author parra
 */
public class Nodo {
    private int dato;
    private Nodo izq, der;

    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.izq = izq;
        this.der = der;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    } 

    public int nodosCompletos(Nodo raiz) {
        if (raiz == null) {
            return 0;
        } else if ((raiz.getIzq() != null) && (raiz.getDer() != null)) {
            return nodosCompletos(raiz.getIzq()) + nodosCompletos(raiz.getDer()) + 1;
        }
        return nodosCompletos(raiz.getIzq())+ + nodosCompletos(raiz.getDer());
    }
}
