package practica1edd.Estructuras;

import Objetos.Ficha;

public class Cola {
 
	NodoFicha inicio;
        NodoFicha fin;
	public void Cola()
	{
		inicio=fin=null;
	}
	public boolean vacia()
	{
		return inicio==null;
	}	
	public void insertar(Ficha f)
	{
		NodoFicha nuevo = new NodoFicha(f);
		if(vacia())
		{
			inicio = nuevo;
		}
		else
		{
			fin.enlace=nuevo;
		}
		fin = nuevo;
	}
	public Ficha extraer()
	{
		Ficha a = inicio.dato;
		inicio = inicio.enlace;
		return a;
	} 
	public Ficha inicio()
	{
		return inicio.dato;
	}
	public Ficha fin()
	{
		return fin.dato;
	}
	public void limpiar()
	{
	while(!vacia())
	{
		extraer();
	}		
	}
    
}
