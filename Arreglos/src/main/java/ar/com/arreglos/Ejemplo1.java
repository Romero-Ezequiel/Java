package ar.com.arreglos;

//Creo un array que almacene 5 elementos y que me imprima 
//un elemento del array
public class Ejemplo1 {

    public static void main(String[] args){
        
        
        int [] miMatriz = new int[5];
        
        miMatriz[0] = 1;
        miMatriz[1] = 2;
        miMatriz[2] = 3;
        miMatriz[3] = 4;
        miMatriz[4] = 5;
        
        for(int i=0; i< miMatriz.length; i++){
            System.out.println(miMatriz[i]);
        }

        
    }
}
