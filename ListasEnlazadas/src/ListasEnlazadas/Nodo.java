/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;

/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 * Ultima fecha de modificacion: 26/03/2019
 */
public class Nodo // creamos un nodo
{
    	int info;
	public Nodo Siguiente;
	public Nodo (int dato)
	{
		info=dato;
	}
	public void verNodo() //ver nodo
	{
		System.out.print("(  "+info+" )");
	}

}
