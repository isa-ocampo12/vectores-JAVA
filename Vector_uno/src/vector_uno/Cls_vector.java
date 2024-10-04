/*Dos métodos,  uno para llenatr el vector y otro para imprimir el vector*/
package vector_uno;
import java.util.Scanner;
public class Cls_vector extends Cls_operaciones {
    
    public int[] Leer_vector(int n){
        Scanner teclado = new  Scanner (System.in);
        int[] numeros = new int [n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese elemento: ");
            numeros [i] = teclado.nextInt();
        }
        return numeros;        
    }//Fin del metodo para leer el vector
    public void Imprimir_vector(int n, int[] numeros){
        System.out.println("\n\t Datos del vector: ");
        for (int i = 0; i < n; i++) {
            System.out.print(numeros[i] + " ");
        }
    }//Fin del metodo para imprimir vector
}
