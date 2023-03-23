
package guia3clase456ejercicio1;

import java.util.Scanner;

/**
 +Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por 
 * ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo 
 * siguiente:
 */
public class Guia3clase456ejercicio8 {
public static void main(String[] args) {
Scanner leer= new Scanner(System.in);
int tamaño;
    System.out.println("ingrese tamaño de cuadrado");
    tamaño=leer.nextInt();
String matriz[][]= new String[tamaño][tamaño]; 
for (int i = 0; i < tamaño; i++){
for (int j = 0; j < tamaño; j++){
if (i==0||i==tamaño-1 || j==0||j==tamaño-1)
{matriz[i][j]="*";
}
else
matriz[i][j]=" ";}}

for (int i = 0; i < tamaño; i++){
for (int j = 0; j < tamaño; j++){
 System.out.print(matriz[i][j]);
}
 System.out.println();     
}


}
    
}
    


