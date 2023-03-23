
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los
 * números del 0-0-0 al 9-9-9, con la particularidad que cada vez que aparezca
 * un 3 lo
 */
public class Guia3calse456ejercicioextra12  {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int centenas = 0;
        int decenas = 0;
        int unidades = 0;

        for (int i = 0; i < 100; i++) {
            unidades++;

            if (unidades == 10) {
                unidades = 0;
                decenas++;
            }

            if (decenas == 10) {
                decenas = 0;
                centenas++;
            }

            if (centenas == 10) {
                centenas = 0;
            }

            // Convertir números a cadena para reemplazar '3' por 'E'
            String strCentenas = String.valueOf(centenas);
            String strDecenas = String.valueOf(decenas);
            String strUnidades = String.valueOf(unidades);

            if (strCentenas.equals("3")) {
                strCentenas = "E";
            }
            if (strDecenas.equals("3")) {
                strDecenas = "E";
            }
            if (strUnidades.equals("3")) {
                strUnidades = "E";
            }

            System.out.println(strCentenas + "-" + strDecenas + "-" + strUnidades);
        }
    }
}
