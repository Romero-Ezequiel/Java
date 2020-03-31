
import javax.swing.JOptionPane;

/*
6) Lee un número por teclado e indica si
es divisible entre 2 (resto = 0). 
Si no lo es, también debemos indicarlo.
*/
public class Ejercicio6 {

    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        //Caclcular si es divisible por 2
        if(numero % 2 == 0){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }
    }
    
}
