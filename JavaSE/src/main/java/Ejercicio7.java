
import javax.swing.JOptionPane;
/*
7) Lee un número por teclado y muestra por consola,
el carácter al que pertenece en la tabla ASCII. 
Por ejemplo: si introduzco un 97, me muestre una a.

*/
public class Ejercicio7 {

    public static void main(String[] args) {
       
        String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
        //Pasamos el String a int
        int codigo=Integer.parseInt(texto);
 
        //Pasamos el codigo a caracter
        char caracter=(char)codigo;
 
        System.out.println(caracter);
        
    }
}
