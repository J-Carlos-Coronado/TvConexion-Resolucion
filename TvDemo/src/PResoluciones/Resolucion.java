package PResoluciones;

/**
 *En este apartado creamos la clase Resolucion que sirve para adaptar la pantalla
  Class Resolucion
 */
public class Resolucion {

    //
    // @author: Alejandro Espinoza Aguilar 
    // @author: Jose Carlos Coronado Chable (Documentador)
    //@version: 24/05/202
    //
    //
    private double largo;
    private double ancho;

    //
    // Creacion del constructor Resolucion 
    //
    //Herrera improvement public Resolucion () { };
    /**
     *
     // en este apartado tomamos como parametro el largo y ancho de la televison para que se pueda ajustar 
     * @param largo 
     * @param ancho
     *
     */
    public Resolucion(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    //
    // Methods
    //con este metodo podemos darle un tamaño largo a la pantalla
    //
    // Accessor methods
    //
    /**
     * Fija el valor de largo
     *
     * @param newVar el nuevo valor de largo
     */
    public void setLargo(double largo) {
        this.largo = largo;
    }

    /**
     * Devuelve el valor de largo
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

    // cierre del metodo ancho  
    // Other methods
    //
}//Cierre de la clase
