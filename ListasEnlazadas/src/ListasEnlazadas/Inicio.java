/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListasEnlazadas;
import javax.swing.JOptionPane;
/**
 *
 * @author Jorge Ivan Vasquez Sosa (0901-16-4067)
 * Ultima fecha de modificacion: 26/03/2019
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea un vector y le ingresamos numeros
      
        ListasEnlazadas miLista=new ListasEnlazadas();
	miLista.InsertarEnPrimero(10);
	miLista.InsertarEnPrimero(15);
	miLista.InsertarEnPrimero(30);
	miLista.InsertarEnPrimero(50);
        miLista.InsertarEnPrimero(90);
        miLista.InsertarEnPrimero(18);
        miLista.InsertarEnPrimero(25);
	miLista.InsertarEnPrimero(40);
	miLista.InsertarEnPrimero(60);
        
        //Mandamos a llamar las clases correspondientes
        
       
	System.out.println(miLista.Listar());
 
	System.out.println("borrar");
        miLista.BuscarPosicion();
        miLista.borrarPosicion(5);
	miLista.borrarUltimo();
        miLista.borrarPrimero();
	
	System.out.println(miLista.Listar());
// TODO code application logic here
    }
    
}
