package pc;
import lse.ListaSimplementeEnlazada;
import lse.Nodo;

public class Cola extends ListaSimplementeEnlazada{
    @Override

    public void insertar (Object dato) {
        if (estavacia()){
            Nodo nuevo = new Nodo(dato,null);
            primero = nuevo;


        }else {
            Nodo ultimo = primero;
            while(ultimo.getSiguiente()!=null){
                ultimo = ultimo.getSiguiente();

            }
            Nodo nuevo = new Nodo(dato,null);
            ultimo.setSiguiente(nuevo);

        }

    }
}