package practica1edd.Estructuras;

import Objetos.Usuario;

public class ListaJugadores {
    NodoJugador nodo;
    public ListaJugadores()
    {
        nodo = null;
    }
    public ListaJugadores insertar(Usuario entrada)
    {
        NodoJugador nuevo;
        nuevo = new NodoJugador(entrada);
        if(nodo!=null)
        {
            nuevo.enlace = nodo.enlace;
            nodo.enlace=nuevo;
        }
        nodo=nuevo;
        return this;
    }
    public Usuario siguiente()
    {
     NodoJugador p;
     if(nodo!=null)
     {
         p = nodo.enlace;
         nodo=nodo.enlace;
         return p.dato;
     }
     else
     {
         return null;
     }
    }
}
