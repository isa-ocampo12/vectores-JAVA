/*Hacer un programa que lea e imprima un vectror de tamaño n, numeros enteros, y luego en otra clase 
me halle el promedio de los elementos del vector y la cantidad de multiplos dee 5 que hay */
package vector_uno;
//librerias
 import java.util.Scanner;
public class Vector_uno {


    public static void main(String[] args) 
    {
        /*definicion de objetos y variables*/
        Scanner teclado = new Scanner (System.in);
        Cls_vector obj_vector = new Cls_vector();
        Cls_operaciones obj_operaciones = new Cls_operaciones();
        
        float prom;
        int n, cont;
        //Leer el tamaño de vector 
        System.out.print("Cuantos elementos tiene el vector?: ");
        n = teclado.nextInt();
        //crear el vector 
        int[] numeros = new int [n];
        //leer e imprimir el vector
        numeros = obj_vector.Leer_vector(n);
        obj_vector.Imprimir_vector(n, numeros);
        //Hallar e imprimir el promedio de los elementos del vector
        prom = obj_vector.Hallar_promedio(n, numeros);
        System.out.println("\n\t El promedio de los elementos es: " + prom);
        //Contar y mostrar los multiplos de cinco
        cont = obj_vector.Hallar_multiplos_cinco(numeros);
        System.out.println("\n Cantidad de multiplos de cinco: " + cont);
        
    }
    
}
