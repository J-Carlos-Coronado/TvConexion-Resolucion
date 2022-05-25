package PResoluciones;


// @author: Jose Carlos Coronado Chable (Documentador)
// @author:Alex Reyes (Coder)
//@version: 24/05/2022
/**
 * Class Resolucion
 */
public class Resolucion {

    //
    // Fields
    //
    // Campos de tipo privado que tienen como variables estaticas largo y ancho que sirven para dar un tamaño a la pantalla 
    private double largo;
    private double ancho;

    //
    // Constructors
    //
    //Herrera improvement public Resolucion () { };
    /**
     *
     * @param largo
     * @param ancho
     *
     */
    //creamos el constructor resolucion que toma como parametros el largo y el ancho 
    public Resolucion(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    //
    // Methods
    //
    //
    // Accessor methods
    //
    /**
    //Fija el valor de largo
     *
     * @param newVar el nuevo valor de largo
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     // Devuelve el valor de largo
     *
     * @return el valor de largo
     */
    public double getLargo() {
        return largo;
    }

    /**
     * Fija el valor de ancho
     *
     * @param newVar el nuevo valor de ancho
     */
    public void setAncho(double newVar) {
        ancho = newVar;
    }

    /**
     * Devuelve el valor de ancho
     *
     * @return el valor de ancho
     */
    public double getAncho() {
        return ancho;
    }

    //
    // Other methods
    
}//Cierre de la clase y del metodo
