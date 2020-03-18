package main;

public class MenuPrincipal {

    //Aca instancio todas las clases 
    public static void main(String[] args) {
        
        //Realizo un objeto de la clase Variable para mostar en consola los valores
        Variables valor = new Variables();
        System.out.println("Los valores de las variables son: ");
        valor.imprimir();
        
        System.out.println("\n********************************\n");
        
        //Tipos de datos primitivos de tipo Int
        TiposPrimitivosInteger tiposInteger = new TiposPrimitivosInteger();
        System.out.println("Tipos de datos Integer:");
        tiposInteger.imprimir();
        
        System.out.println("\n********************************\n");

        //Utilice la clase sistemasNumericos y realice un objeto
        SistemasNumericos numeros = new SistemasNumericos();
        System.out.println("Ejercicio de Sistema de Numeración");
        numeros.Imprimir();
        
        System.out.println("\n********************************\n");

    }
    
    
}
