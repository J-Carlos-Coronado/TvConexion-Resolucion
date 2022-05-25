package PResoluciones;

// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
//@version: 24/05/2022
/**
 * Class Resolucion1K
 //Esat clase nos dara la resolucion 1k
 */
//Clase ResolucionHD es una clase hija de Resolucion 
public class Resolucion1K extends Resolucion {

  //
  // Fields
  //
  // Campos de tipo privado que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla 
  //Largo=1080 x ancho= 1920
    private final static int LARGO = 1080;
    private final static int ANCHO = 1920;
     
    
  //
  // Fields
  //
  //Super toma como parametros el largo y el ancho 
    public Resolucion1K() {
        super(LARGO,ANCHO);
    }
  
  //
  // Constructors
  //

  //Herrera improvement public Resolucion1K () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //





}//Cierre de la clase y del metodo
