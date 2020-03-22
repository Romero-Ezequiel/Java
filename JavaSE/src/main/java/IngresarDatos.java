
import java.util.Scanner;

public class IngresarDatos {

    //Creo un tipo de dato Scanner
    Scanner entrada = new Scanner(System.in);
    //Scanner entradaFlotante = new Scanner(System.in);

    
    int numeroEntero;
    float numeroFloat;
    double numeroDouble;
    char caracter;
    String cadenaTexto;
    
    
    public IngresarDatos(){
        
        System.out.println("**********************************");
        System.out.println("Ingrese un número entero: ");
        this.numeroEntero = this.entrada.nextInt();
        System.out.println("El valor es : "+ this.numeroEntero);
        
                
        System.out.println("**********************************");
        System.out.println("Ingrese un número flotante: ");
        this.numeroFloat = this.entrada.nextFloat();
        System.out.println("El valor es : "+ this.numeroFloat);
        
        
        System.out.println("**********************************");
        System.out.println("Ingrese un número double: ");
        this.numeroDouble = this.entrada.nextDouble();
        System.out.println("El valor es : "+ this.numeroDouble);
        
        
        System.out.println("**********************************");
        System.out.println("Ingrese un caracter: ");
        this.caracter = this.entrada.next().charAt(0);
        System.out.println("El valor es : "+ this.caracter);
        
        
        System.out.println("**********************************");
        System.out.println("Ingrese una cadena de texto: ");
        this.cadenaTexto = this.entrada.nextLine();
        System.out.println("El valor es : "+ this.cadenaTexto);
        
    }        
                
            
            
  
    
    
    
}
