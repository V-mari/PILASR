package lse;

import pila.Pila;

public class Main {
    public static void main(String[] args) {
        ListaSimplementeEnlazada listaSimplementeEnlazada = new ListaSimplementeEnlazada();

        Pila pila = new Pila();
        pila.insertar(2);
        pila.insertar(4);
        pila.insertar(1);
        pila.insertar(0);
        pila.insertar(9);
        pila.insertar(5);
        pila.mostrar();
        pila.eliminar();
        pila.mostrar();


    }
}