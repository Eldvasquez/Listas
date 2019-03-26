
package ListasEnlazadas;

import java.util.Scanner;

/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 * Ultima fecha de modificacion: 26/03/2019
 */
public class ListasEnlazadas
{
    	Nodo Primero;
	public ListasEnlazadas()
	{
		Primero=null;
	}
        //Revisa si la primera casilla esta vacia
	public boolean vacia()
	{
		if (Primero==null)
		{
			return(true);
		} else
		{
			return(false);
		}
	}
	public void InsertarEnPrimero(int Dato)
	{
		Nodo Temporal=new Nodo(Dato); //Crea el nodo temporal
		Temporal.Siguiente=Primero; //corre al primero
		Primero=Temporal;   //lo coloca de primero
	}
	public void borrarPrimero()
	{
		Primero=Primero.Siguiente;
	}
	public String Listar()
	{
		String Dato=" ";
		Nodo aux=Primero;
		while (aux!=null)
		{
			Dato+="{" + aux.info + "}";
			aux=aux.Siguiente;
		}
		return(Dato);
	}
	public void borrarUltimo()
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		while (actual.Siguiente!=null)
		{
			anterior=actual;
			actual=actual.Siguiente;
		}
		anterior.Siguiente=null;
	}
	public void borrarPosicion(int pos)
	{
		Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
                
		if (pos>0)
		{
			while (k!=pos && actual.Siguiente != null)
			{
				anterior=actual;
				actual=actual.Siguiente;
				k++;
				System.out.println("K       "+k);
			}
			anterior.Siguiente=actual.Siguiente;
		}
	}
public void BuscarPosicion(){
    Scanner entrada = new Scanner (System.in);
                Nodo anterior=Primero;
		Nodo actual=Primero;
		int k=0;
                int pos;
                System.out.println("Ingrese la posicion que desea buscar: ");
                pos =entrada.nextInt();
		if (pos>=0)
		{
			while (k!=pos && actual.Siguiente != null)
			{
				anterior=actual;
				actual=actual.Siguiente;
				k++;
				
			}
			System.out.println("K       "+pos+" :"+actual.info);
		}

}

}

