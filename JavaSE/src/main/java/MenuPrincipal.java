//Aca voy a ejecutar e invocar todas las clases y métodos
public class MenuPrincipal {

    //Método principal main
    public static void main(String[] args) {
        
        //Declaro una variable de tipo Variables. Es decir estoy creando un objeto
        Variables tipo = new Variables();
        
        //Muestro en consola el contenido del objeto
        tipo.imprimir();
        
        //Instancia de la clase IngresarDatos
        IngresarDatos valor = new IngresarDatos();
       // System.out.println(valor);
       
       IngresarJOptionPanel dato1 = new IngresarJOptionPanel();
       dato1.imprimir();
    }
    
}
