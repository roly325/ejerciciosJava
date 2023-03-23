
package guia5clase9y11ejercicioextras;

import java.util.Scanner;

/**
 *
 * Los profesores del curso de programación de Egg necesitan llevar un registro
 * de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad
 * de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene
 * 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales.
 * Las ponderaciones de cada nota son:
 */
public class Guia5clase9y11ejercicioextras4 {
      public static void main(String[] args) {
          
          String[][] tabla= new String[4][6];
          tabla = cargar(tabla);
          mostrar(tabla);
          verificar(tabla);
          
      }
      //ver cuantos aprobados y desaporbados 
      public static void verificar(String[][]matriz)
      
       {  int cont=0;
          for (int i=0;i<4;i++) 
        {   for(int j=5;j<6;j++)
            {   if (Integer.parseInt(matriz[i][j]) >= 6)
                {cont++;
                }
            }
        }
           System.out.println("alumnos aprobados: "+cont);
           System.out.println("alumno desaprobados "+(4-cont));
      }
      
      //mostrar tabla
      public static void mostrar(String[][]matriz)
      { for (int i=0;i<4;i++)
        {   for(int j=0;j<6;j++)
            {System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
      }
         
      //cargar tabla 
      public static String[][]cargar(String[][]tabla)
      { Scanner leer= new Scanner(System.in);
     
      for(int i=0;i<4;i++)
        {   System.out.println("ingrese nombre de alumno n°: "+(i+1));
             tabla[i][0]=leer.next();
             int porcentaje=0;
            for(int j=1;j<6;j++)
            {   switch(j)
                { case 1:System.out.println("ingrese nota de primer trabajo practico");
                  int nota1=leer.nextInt();
                  tabla[i][j] = String.valueOf(nota1 * 10 / 100);
                  porcentaje =(porcentaje+nota1 * 10 / 100);
                 
                  break;
                  case 2: System.out.println("ingrese nota de segundo trabajo practico");
                  int nota2=leer.nextInt(); 
                  tabla[i][j]=String.valueOf(nota2 * 15 / 100);
                  porcentaje =(porcentaje+nota2 * 15 / 100);
         
                  break;
                  case 3: System.out.println("ingrese nota primer integrador");
                  int nota3=leer.nextInt();
                  tabla[i][j]=String.valueOf(nota3 * 25/100);
                  porcentaje=(porcentaje+nota3 * 25/100);
                
                  break;
                  case 4:System.out.println("ingrese nota segundo integrador");
                  int nota4=leer.nextInt();
                  tabla[i][j]=String.valueOf(nota4 *50/100);
                  porcentaje=(porcentaje+nota4* 50/100);
                 
                  break; 
                  case 5:
                      tabla[i][j]=String.valueOf(porcentaje);
                      break;
                }     
               
            }
            
            
        }
        return tabla;   
    }
      
          
      
}
