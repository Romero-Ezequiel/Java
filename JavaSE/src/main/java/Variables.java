
public class Variables {

    //Declaración de variables
    int numeroInt = 10;
    short numeroShort = 30;
    double numeroDouble = 40.0;
    long numeroLong = 50L;
    float numeroFloat = 10F;
    boolean numeroBoolean = true;
    char caracter = 'h';
    String cadena = "Hola Mundo";
    
    //Realice un metodo para mostrar en consola los valores de las variables
    public void imprimir(){
        System.out.println("Numero = " + this.numeroInt);
        System.out.println("Numero = " + this.numeroShort);
        System.out.println("Numero = " + this.numeroDouble);
        System.out.println("Numero = " + this.numeroLong);
        System.out.println("Numero = " + this.numeroFloat);
        System.out.println("Caracter = " + this.caracter);
        System.out.println("Cadena de texto = " + this.cadena);
    }
    

    
}