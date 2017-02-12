package practica1edd.Estructuras;

import Objetos.Ficha;

public class Nodo {
    Ficha dato;
    Nodo enlace;

    public Nodo(Ficha ficha)
    {
        dato=ficha;
        enlace=null;
    }
    public Nodo(Ficha ficha,Nodo n)
    {
        dato=ficha;
        enlace=n;
    }
    public Ficha getDato()
    {
    return dato;
    }
    public Nodo getEnlace()
    {
    return enlace;
    }
    public void setEnlace(Nodo enlace)
    {
    this.enlace = enlace;
    }
}
