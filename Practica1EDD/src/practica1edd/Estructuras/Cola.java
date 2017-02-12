package practica1edd.Estructuras;

import Objetos.Ficha;

public class Cola {
 
	Nodo inicio,fin;
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
		Nodo nuevo = new Nodo(f);
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
