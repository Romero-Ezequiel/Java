
import javax.swing.JOptionPane;

/*
9) Lee un número por teclado que pida
el precio de un producto (puede tener decimales) 
y calcule el precio final con IVA. 
El IVA sera una constante que sera del 21%.
*/
public class Ejercicio9 {
    
    public static void main(String[] args) {
        //Declaramos una constante
        final double IVA=0.21;
 
        String texto=JOptionPane.showInputDialog("Introduce el precio de un producto");
        //Pasamos el String a double
        double precio=Double.parseDouble(texto);
 
        //Obtenemos el precio final (precio+(precio*IVA))
        double precioFinal=precio+(precio*IVA);
 
        System.out.println(precioFinal);
    }
    
}
