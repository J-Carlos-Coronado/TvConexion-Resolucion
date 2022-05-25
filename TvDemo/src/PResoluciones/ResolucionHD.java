package PResoluciones;


// @author: Jose Carlos Coronado Chable (Documentador)
// @author: Alex Reyes (Coder)

//@version: 24/05/2022

/**
 * Class ResolucionHD
 */
//Clase ResolucionHD es una clase hija de Resolucion 
public class ResolucionHD extends Resolucion {


     
    
  //
  // Fields
  // Campos de tipo privado que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla 
    private final static int LARGO = 1280;
    private final static int ANCHO = 720;
    
  //
  // Constructors
  // Creacion del constructor Resolucion HD que nos dara una mejor visivilidad en la tv 
  //Super toma como parametros el largo y el ancho 
    public ResolucionHD() {
        super(LARGO,ANCHO);
    }
  //Herrera improvement public ResolucionHD () { };
  
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
