
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 *Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre 
 * su equivalente en romano.
 */
public class Guia3calse456ejercicioextra4 {
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 10");
        int num=leer.nextInt();
        while (num<1|| num>10)
        {   System.out.println("-- el numero ingresado no es valido --");
            System.out.println("--- ingrese un numero del 1 al 10  ---");
            num=leer.nextInt();
        }
        while (num !=0){
        switch (num)
        {case 1: System.out.println("el numero "+num+"en romano es: "+"I");
        break;
        case 2: System.out.println("el numero "+num+"en romano es: "+"II");
        break;
        case 3: System.out.println("el numero "+num+"en romano es: "+"III");
        break;
        case 4: System.out.println("el numero "+num+" en romano es: "+"IV");
        break;
        case 5: System.out.println("el numero "+num+" en romano es: "+"V");
        break;
        case 6: System.out.println("el numero "+num+" en romano es: "+"VI");
        break;
        case 7: System.out.println("el numero "+num+" en romano es: "+"VII");
        break;
        case 8: System.out.println("el numero "+num+" en romano es: "+"VIII");
        break;
        case 9: System.out.println("el numero "+num+" en romano es: "+"IX");
        break;
        case 10:System.out.println("el numero "+num+" en romano es: "+"X");
        break;
        }
            System.out.println("--- ingrese un numero del 1 al 10 ---");
            System.out.println("---    ingrese 0 para finalizr    ---");
            num=leer.nextInt();
           
        }
        if (num==0)
        {
        }System.out.println("----Finalizado----");
    }
    
}
