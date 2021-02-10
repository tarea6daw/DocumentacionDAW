package clases;

/**
 * Clase Rectangulo.java
 *
 * Clase que define un rectángulo. El rectángulo se determina mediante su
 * base y altura.
 *
 * @autor Miguel Proba Estévez
 * @version 1.0
 * @since 2021-02-09
 * @see <a href = "http://www.miguelproba.com" /> Web - Miguel Proba </a>
 *
 */
public class Rectangulo extends Figura{

    // Atributos

    /**
     * Base del rectángulo.
     */
    private double base;

    /**
     * Altura del rectángulo.
     */
    private double altura;

    // Métodos públicos

    /**
     * Método que calcula el área multiplicando la base por la altura.
     *
     * @return Double con el resultado del cálculo del área.
     */
    public double CalcularArea() {        
        return this.area=(base*altura);
     }

    /**
     * Método que obtiene la base del rectángulo.
     *
     * @return Double con la base del rectángulo.
     */
    public double getBase() {
        return base;
    }

    /**
     * Método que setea la base del rectángulo.
     *
     * @param base Parámetro de tipo duoble que especifica la base del rectángulo.
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * Método que obtiene la altura del rectángulo.
     *
     * @return Double con la altura del rectángulo.
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Método que setea la altura del rectángulo.
     *
     * @param altura Parámetro de tipo duoble que especifica la altura del rectángulo.
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
