/*Metodos psra hallar el promedio de los elementos y hallar los 
multiplos de 5*/
package vector_uno;

public class Cls_operaciones {
    
    public float Hallar_promedio (int n, int[] numeros){
        float acum=0, prom;
        for (int i = 0; i < n; i++) {
            acum+=numeros[i];
        }
        prom=acum/n;
        return prom;
    } //Fin metodo hallar promedio
    public int Hallar_multiplos_cinco(int[] numeros){
        int cont=0;
        for (int i = 0; i < numeros.length; i++) {
            if(numeros[i] % 5 == 0){
                System.out.println(numeros[i] + "");
                cont++;
            }
        }
        return cont;
    }//Fin método hallar multiplos
         
}
