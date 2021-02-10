package clases;

/**
 * Clase Triangulo.java
 *
 * Clase que define un triángulo. El triángulo se determina mediante su
 * base y altura.
 *
 * @autor Miguel Proba Estévez
 * @version 1.0
 * @since 2021-02-09
 * @see <a href = "http://www.miguelproba.com" /> Web - Miguel Proba </a>
 *
 */
public class Triangulo extends Figura{

    // Atributos

    /**
     * Base del triángulo.
     */
    private double base;

    /**
     * Altura del triángulo.
     */
    private double altura;

    // Métodos públicos

    /**
     * Método que calcula el área multiplicando la base por la altura
     * dividiéndolos entre dos.
     *
     * @return Double con el resultado del cálculo del área.
     */
    public double CalcularArea() {        
        return this.area=(base*altura)/2;
     }

    /**
     * Método que obtiene la base del triángulo.
     *
     * @return Double con la base del triángulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Método que setea la base del triángulo.
     *
     * @param base Parámetro de tipo double que especifica la base del triángulo.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Método que obtiene la altura del triángulo.
     *
     * @return Double con la altura del triángulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método que setea la altura del triángulo.
     *
     * @param altura Parámetro de tipo double que especifica la altura del triángulo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
