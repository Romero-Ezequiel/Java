
import javax.swing.JOptionPane;

/*
3) Declara un String que contenga tu nombre, 
después muestra un mensaje de bienvenida por consola. 
Por ejemplo: 
si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.

*/

public class Ejercicio3 {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog("Ingrese un nombre");
        JOptionPane.showMessageDialog(null, "Bienvenido "+ nombre);
    }
    
}
