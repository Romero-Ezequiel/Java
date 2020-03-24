
import java.util.Scanner;

/*
4) Modifica la aplicación anterior, 
para que nos pida el nombre que queremos introducir (recuerda usar Scanner).

*/
public class Ejercicio4 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        System.out.println("Ingrese un nombre: ");
        nombre = entrada.nextLine();
        
        System.out.println("Bienvenido "+ nombre);
    }
    
}
