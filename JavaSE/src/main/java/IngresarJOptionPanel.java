
import javax.swing.JOptionPane;


public class IngresarJOptionPanel {

    void imprimir(){
        //Ingresar datos via showInputDialog para visualizarlo con una ventana grafica
        
        String cadena = JOptionPane.showInputDialog("Mete una cadena");
        JOptionPane.showMessageDialog(null, "Tu cadena es "+ cadena);
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        JOptionPane.showMessageDialog(null, "Tu cadena es "+ numero);
        
        float numero1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un número"));
        JOptionPane.showMessageDialog(null, "Tu cadena es "+ numero1);
        
        //System.out.println("Tu cadena es: "+ cadena);
    }

    
}
