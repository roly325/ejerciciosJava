
package guia5clase9y11ejercicio1;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class Guia5clase9y11ejercicio6 {
     public static void main(String[] args) {
         int[][]matriz={ {2, 7,6}, {9, 5, 1}, {4, 3, 8} };
         //suma de la frimera fila para luego verificar
         
         int suma=matriz[0][0]+matriz[0][1]+matriz[0][2];
           // Suma de filas
        for (int i = 1; i < 3; i++) {
            int sumaFila = matriz[i][0] + matriz[i][1] + matriz[i][2];
            if (sumaFila != suma) {
                System.out.println("El cuadrado no es mágico.");
                System.exit(0);
            }
        }
        //suma columnas
            for (int i = 1; i < 3; i++) {
            int sumaColumna = matriz[0][i] + matriz[1][i] + matriz[2][i];
            if (sumaColumna != suma) {
                System.out.println("El cuadrado no es mágico.");
                System.exit(0);
            }
        }
            
        // Suma de diagonal principal
        int sumaDiagonalPrincipal = matriz[0][0] + matriz[1][1] + matriz[2][2];
        if (sumaDiagonalPrincipal != suma) {
            System.out.println("El cuadrado no es mágico.");
            System.exit(0);
        }
          // Suma de diagonal secundaria
        int sumaDiagonalSecundaria = matriz[0][2] + matriz[1][1] + matriz[2][0];
        if (sumaDiagonalSecundaria != suma) {
            System.out.println("El cuadrado no es mágico.");
            System.exit(0);
        }
              // Si todas las sumas son iguales, el cuadrado es mágico
        System.out.println("El cuadrado es mágico.");
         
     }
     
}
