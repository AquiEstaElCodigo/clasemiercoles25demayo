
package segundaprueba;

import java.util.Scanner;

/**
 *
 * @author germanriveros
 */



/**
 * 
 * 
 * 
 * 
 * 
 * 
 *              TOTAL DE PUNTAJE DE LA CLASE MenuGestion Y
 *                       DEL MÉTODO main 
 * 
 * 
 *                         17 PUNTOS
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class MenuGestion // 1 punto
{
    
    private static Scanner leer;
    private static Tienda mTienda;
    
    public static void main(String[] args) // 2 puntos
    {
        
        leer = new Scanner(System.in); // 1 punto
        mTienda = new Tienda(); // 1 punto
        do
        {
            int opcion;

            System.out.println("--- Bienvenido al menú de Gestion ---");
            System.out.println("1.- Agregar producto");
            System.out.println("2.- Consultar producto");
            System.out.println("3.- Eliminar producto");

            System.out.print("\nIngrese alguna de la opciones: ");

            opcion = leer.nextInt(); // 1 punto

            //puntaje por el menú 2 puntos
            
            
            switch(opcion) // 2 puntos
            {

                case 1:

                    mTienda.agregarProducto(); // 1 pùnto
                    break;

                case 2:

                    mTienda.consultarProducto(); // 1 punto
                    break;

                case 3:

                    mTienda.retirarProducto(); // 1 punto
                    break;

                default: // 1 punto

                    System.err.println("Opcion incorrecta: " + 
                            "ingrese un número entre 1 y 3");
            }
            
            
        }while(true); // 3 puntos
        
    }//..
    
}//.
