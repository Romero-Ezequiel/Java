/*
12) Muestra los números del 1 al 100 (ambos incluidos)
divisibles entre 2 y 3. Utiliza el bucle que desees.
*/
public class Ejercicio12 {
    
    public static void main(String[] args){
    
        int numero = 1;
        while(numero <= 100){
            
            if(numero%2==0 || numero%3==0){
                System.out.println(numero);
            }
            numero++;
        }
    
    }
}
