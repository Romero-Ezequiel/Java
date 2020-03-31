
import javax.swing.JOptionPane;

/*
5) Haz una aplicación que calcule el área de un círculo(pi*R2). 
El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
Usa la constante PI y el método pow de Math.

*/
public class Ejercicio5 {

    public static void main(String[] args) {
        
        double radio, area;
        radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio"));
        
        //Calcular el area del circulo
        area = Math.PI * Math.pow(radio, 2);
        
        JOptionPane.showMessageDialog(null, "El area del circulo es "+ area);
    }
        
        
}
