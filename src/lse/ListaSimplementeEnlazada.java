package lse;

public class ListaSimplementeEnlazada {
    protected Nodo primero;
    public ListaSimplementeEnlazada(){
        primero = null;
    }
    public boolean estavacia(){
        return primero ==null;

    }
    public void insertar(Object dato){
        if (estavacia()){
            Nodo nuevo = new Nodo(dato,null);
            primero = nuevo;


        }else {
            Nodo nuevo = new Nodo(dato,primero);
            primero = nuevo;
        }

    }
    public void eliminar(){
        if (!estavacia()){
            primero = primero.getSiguiente();

        }
    }
    public void mostrar(){
        Nodo tmp = primero;
        while(tmp!=null){
            System.out.print(tmp.getDato() + " ");
            tmp=tmp.getSiguiente();

        }
        System.out.println();
    }
}