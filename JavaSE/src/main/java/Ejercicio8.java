
import java.util.Scanner;

/*
8) Modifica el ejercicio anterior, para que en lugar 
de pedir un número, pida un carácter (char) y 
muestre su código en la tabla ASCII.
*/
public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter ASCII");
        char caracter = sc.next().charAt(0);

        //Pasamos el caracter a codigo
        int codigo = (int) caracter;

        System.out.println(codigo);
        
    }
}
