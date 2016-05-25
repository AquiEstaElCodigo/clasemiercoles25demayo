
package segundaprueba;

import java.util.Scanner;
import java.util.Stack;

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
 * 
 *          TOTAL DE PUNTAJE DE LA CLASE Bodega Y DE
 *                      LA CLASE Tienda
 * 
 * 
 *                          28 + 6
 * 
 *                         34 PUNTOS
 * 
 *
 * 
 * 
 * 
 */


/**
 * 
 * 
 * TOTAL PUNTAJE CLASE Bodega Y Constructor : 
 *                      
 *              6 PUNTOS
 * 
 */


class Bodega // 1 punto 
{
    protected Stack PRODUCTOS; // 1 punto
    
    Bodega() // 1 punto
    {
        
        PRODUCTOS = new Stack(); // 1 punto
        
        
        // 2 puntos por los elementos añadidos
        
        PRODUCTOS.push("Producto A");
        PRODUCTOS.push("Producto B");
        PRODUCTOS.push("Producto C");
        
        /*
         * la pila tiene 2 pts, 1 por declarar y otro por instanciar
         * 
         */
        
    }//..
    
}//.


/**
 * 
 * 
 *TOTAL PUNTAJE CLASE Tienda Y MÉTODOS
 *                  
 *          3 + 9 + 6 + 10
 * 
 *             28 PUNTOS
 * 
 */



public class Tienda extends Bodega // 3 puntos (declaracion y herencia)
{
    
    private Scanner leer;
    
    
    /**
     * 
     * TOTAL PUNTAJE MÉTODO agregarProducto() :  9 PUNTOS
     *
     */
    
    protected void agregarProducto() // 2 puntos (declaración)
    {
        
        leer = new Scanner(System.in); // 1 punto
        String nuevo_producto;
        int cantidad_ingresar;
        
        System.out.println("Bienvenido, desea agregar productos");
        System.out.println("Cuantos productos desea agregar?");
        cantidad_ingresar = leer.nextInt(); // 1 punto
        
        leer.nextLine(); //clear buffer
        for (int i = 0; i < cantidad_ingresar; i++) // 2 puntos
        {
            
            System.out.println("Ingrese nuevo producto: ");
            
                nuevo_producto = leer.nextLine(); // 1 punto
            
                    PRODUCTOS.push(nuevo_producto); // 2 puntos
        }
        
    }//..
    
    
    
    /**
     * 
     * TOTAL PUNTAJE MÉTODO consultarProducto() :  6 PUNTOS
     * 
     */
    

    protected void consultarProducto() // 2 puntos
    {
        
        System.out.println("Bienvenido, desea consultar productos");
        
        if(PRODUCTOS.empty()) System.err.println("No hay productos en Stock");
            
            else System.out.println("Productos disponibles: \n" 
                    + PRODUCTOS + "\n");  
        
        // 4 puntos (instrucción if-else)
        
    }//..
    
    
    
    /**
     * 
     * TOTAL PUNTAJE MÉTODO retirarProducto() : 10  PUNTOS
     * 
     */
    
    
    protected void retirarProducto() // 2 puntos
    {
        
        leer = new Scanner(System.in); // 1 punto
        int cantidad_retirar;
        
        System.out.println("Bienvenido, desea eliminar productos");
        System.out.println("Cuantos productos desea retirar?");
        
        cantidad_retirar = leer.nextInt(); // 1 punto
        
        if(cantidad_retirar <= PRODUCTOS.size()) // 2 puntos
        
            for (int i = 0; i < cantidad_retirar; i++) // 2 puntos 
            
                System.out.println("Retirando: " + PRODUCTOS.pop());
             
        else // 2 puntos
        
            System.err.println("La cantidad es mayor a la del stock");
        
    }//..
    
}//..
