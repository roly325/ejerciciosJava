
package guia5clase9y11ejercicio1;

/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números 
 * enteros y los muestre por pantalla en orden descendente.
 */
public class Guia5clase9y11ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int vector[]=new int[100];
      cargar(vector);
      mostrar(vector);
        
           
    } 
    public static void cargar(int vector[]){
    for(int i=0;i<100;i++)
    {
      vector[i]=i+1;
    }
    }
    public static void mostrar(int vector[]){
    for (int i=99;i>=0;i--)
    {
        System.out.println(vector[i]);
    }
    
    }       
}
