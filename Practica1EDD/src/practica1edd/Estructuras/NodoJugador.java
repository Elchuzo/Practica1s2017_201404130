package practica1edd.Estructuras;

import Objetos.Usuario;

public class NodoJugador {
    Usuario dato;
    NodoJugador enlace;
    public NodoJugador(Usuario entrada)
    {
        dato = entrada;
        enlace = this;
    }
    
}
