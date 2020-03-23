
import javax.swing.JOptionPane;

/*
1) Declara dos variables numéricas (con el valor que desees),
muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        int num1, num2, resta, suma, multiplicacion, division, modulo;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));

        //Realizo los calculos con los dos números ingresados
        resta = num1 - num2;
        suma = num1 + num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        modulo = num1 % num2;

        JOptionPane.showMessageDialog(null, "La resta entre los dos números es " + resta);
        JOptionPane.showMessageDialog(null, "La suma entre los dos números es " + suma);
        JOptionPane.showMessageDialog(null, "La multiplicacion entre los dos números es " + multiplicacion);
        JOptionPane.showMessageDialog(null, "La division entre los dos número es " + division);
        JOptionPane.showMessageDialog(null, "El modulo entre los dos números es " + modulo);

    }

}
