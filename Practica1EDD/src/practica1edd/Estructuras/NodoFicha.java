package practica1edd.Estructuras;

import Objetos.Ficha;

public class NodoFicha {
    Ficha dato;
    NodoFicha enlace;

    public NodoFicha(Ficha ficha)
    {
        dato=ficha;
        enlace=null;
    }
    public NodoFicha(Ficha ficha,NodoFicha n)
    {
        dato=ficha;
        enlace=n;
    }
    public Ficha getDato()
    {
    return dato;
    }
    public NodoFicha getEnlace()
    {
    return enlace;
    }
    public void setEnlace(NodoFicha enlace)
    {
    this.enlace = enlace;
    }
}
