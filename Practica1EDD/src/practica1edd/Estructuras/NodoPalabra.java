package practica1edd.Estructuras;
import Objetos.Palabra;
public class NodoPalabra {
    Palabra dato;
    NodoPalabra enlace;

    public NodoPalabra(Palabra palabra)
    {
        dato=palabra;
        enlace=null;
    }
    public NodoPalabra(Palabra palabra,NodoPalabra n)
    {
        dato=palabra;
        enlace=n;
    }
    public Palabra getDato()
    {
    return dato;
    }
    public NodoPalabra getEnlace()
    {
    return enlace;
    }
    public void setEnlace(NodoPalabra enlace)
    {
    this.enlace = enlace;
    }
}
