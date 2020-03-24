
import javax.swing.JOptionPane;

/*
2) Declara 2 variables numéricas (con el valor que desees), 
he indica cual es mayor de los dos. Si son iguales indicarlo 
también. Ves cambiando los valores para comprobar que funciona.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));

        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "El número " + num1 + " es mayor que " + num2);

        }if(num2 > num1){
            JOptionPane.showMessageDialog(null, "El número " + num2 + " es mayor que " + num1);
        }
        if (num1 == num2) {
            JOptionPane.showMessageDialog(null, "Los números son iguales " );

        }

    }

}
