package practica1edd.Estructuras;

import Objetos.Palabra;

public class ListaDiccionario {
    private NodoPalabra primero;
    public ListaDiccionario()
    {
        primero=null;
    }
    public ListaDiccionario crearLista(Palabra palabra)
    {
        primero = new NodoPalabra(palabra,primero);
        return this;
    }
    public ListaDiccionario insertarCabeza(Palabra palabra)
    {
        NodoPalabra nuevo;
        nuevo = new NodoPalabra(palabra);
        nuevo.enlace = primero;
        primero = nuevo;
        return this;
    }
    public void visualizarPalabras()
    {
        NodoPalabra n;
        n = primero;
        while(n!=null)
        {
            System.out.println(n.dato.getPalabra());
        }
    }
    public String buscarPalabra(String palabra)
    {
        NodoPalabra indice;
        for(indice = primero; indice!=null;indice=indice.enlace)
        {
            if(palabra == indice.dato.getPalabra())
            {
                return indice.dato.getPalabra();
            }
        }
        return null;
    }
}
