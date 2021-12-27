/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author parra
 */
public class Arbol {

    private Nodo raiz;
    int cant;

    public Arbol() {
        this.raiz = null;
    }

    public boolean esVacio() {
        if (raiz == null) {
            return true;
        } else {
            return false;
        }
    }

    public Nodo getRaiz() {
        return raiz;
    }

    public boolean crearRaiz(int dato) {
        Nodo nuevo = new Nodo(dato, null, null);
        insertar(nuevo, raiz);
        return true;
    }

    public void insertar(Nodo nuevo, Nodo pivote) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= pivote.getDato()) {
                if (pivote.getIzq() == null) {
                    pivote.setIzq(nuevo);
                } else {
                    insertar(nuevo, pivote.getIzq());
                }
            } else {
                if (pivote.getDer() == null) {
                    pivote.setDer(nuevo);
                } else {
                    insertar(nuevo, pivote.getDer());
                }
            }
        }

    }
//   public void crearRaiz(String valor){ 
//      Dato d=new Dato();
//      d.setNumero(Integer.parseInt(valor));
//      Nodo nuevo=new Nodo();
//      nuevo.setElemento(d);
//      if(esVacio()){
//         raiz=nuevo;
//      }else{
//         crearNodo(raiz,nuevo);
//      }
//   }
//   public void crearNodo(Nodo raiz,Nodo nuevo){
//      if(nuevo.getElemento().getNumero()<=raiz.getElemento().getNumero()){
//         if(raiz.getEnlaceIzq()==null){
//            raiz.setEnlaceIzq(nuevo);
//         }else{
//            crearNodo(raiz.getEnlaceIzq(),nuevo);
//         }
//      }else{
//         if(raiz.getEnlaceDer()==null){
//            raiz.setEnlaceDer(nuevo);
//         }else{
//            crearNodo(raiz.getEnlaceDer(),nuevo);
//         }
//      }
//   }
//
//    public void eliminarNodo(int num) {
//        raiz = eliminar(num, raiz);
//    }

//    public Nodo eliminar(int num, Nodo actual) {
//        if (actual == null) {
//            return null;
//        }
//        if (actual.getElemento().getNumero() == num) {
//            return unir(actual.getEnlaceIzq(), actual.getEnlaceDer());
//        }
//
//        if (num < actual.getElemento().getNumero()) {
//            actual.setEnlaceIzq(eliminar(num, actual.getEnlaceIzq()));
//        } else {
//            actual.setEnlaceDer(eliminar(num, actual.getEnlaceDer()));
//        }
//        return actual;
//    }
//    public Nodo unir(Nodo izq, Nodo der) {
//        if (izq == null) {
//            return der;
//        }
//        if (der == null) {
//            return izq;
//        }
//        Nodo centro = unir(izq.getEnlaceDer(), der.getEnlaceDer());
//        izq.setEnlaceDer(centro);
//        der.setEnlaceIzq(izq);
//        return der;
//    }
//    public void mostrarRaiz() {
//        if (!esVacio()) {
//            mostrarNodo(raiz);
//        } else {
//            JOptionPane.showMessageDialog(null,
//                    "No se puede mostrar, árbol vacío!");
//        }
//    }
//    public void mostrarNodo(Nodo n) {
//        if (n != null) {
//            mostrarNodo(n.getEnlaceIzq());
//            //System.out.print(n.getElemento().getNumero() + " ");
//            mostrarNodo(n.getEnlaceDer());
//            System.out.println("");
//        }
//    }
    //cantidad de nodos del arbol
    public String cantidadNodos() {
        cant = 0;
        cantidadNodos(raiz);
        return "" + cant;
    }

    private void cantidadNodos(Nodo reco) {
        if (reco != null) {
            cant++;
            cantidadNodos(reco.getIzq());
            cantidadNodos(reco.getDer());
        }
    }

    public ArrayList preOrden() {
        ArrayList l = new ArrayList();
        preOrden(raiz, l);
        return l;
    }

    private void preOrden(Nodo reco, ArrayList l) {
        if (reco != null) {
            l.add(reco.getDato() + " ");
            preOrden(reco.getIzq(), l);
            preOrden(reco.getDer(), l);
        }
    }

    //imprimir InOrden
    public ArrayList inOrden() {
        ArrayList l = new ArrayList();
        inOrden(raiz, l);
        return l;
    }

    private void inOrden(Nodo reco, ArrayList l) {
        if (reco != null) {
            inOrden(reco.getIzq(), l);
            l.add(reco.getDato() + " ");
            inOrden(reco.getDer(), l);
        }
    }
    
        public ArrayList postOrden() {
        ArrayList l=new ArrayList();
        postOrden(raiz,l);
        return l;
    }

    private void postOrden(Nodo reco, ArrayList l) {
        if (reco != null) {
            postOrden(reco.getIzq(),l);
            postOrden(reco.getDer(),l);
            l.add(reco.getDato() + " ");
        }
    }
}
