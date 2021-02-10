
package clases;

import clases.Figura;

/**
 * Clase Circulo.java
 *
 * Clase que define un círculo. El círculo se determina por su radio
 * y la constante pi.
 *
 * @autor Miguel Proba Estévez
 * @version 1.0
 * @since 2021-02-09
 * @see <a href = "http://www.miguelproba.com" /> Web - Miguel Proba </a>
 *
 */
public class Circulo extends Figura{

    // Atributos

    /**
     * Constante pi.
     */
    final double pi=3.1416;

    /**
     * Radio del círculo.
     */
    private double radio;

    // Métodos públicos

    /**
     * Método que calcula el área multiplicando pi por dos veces el radio.
     *
     * @return Double con el resultado del cálculo del área.
     */
    public double CalcularArea() {        
        return this.area=pi*radio*radio;
     }

    /**
     * Método que obtiene el radio del círculo.
     *
     * @return Double con el radio del círculo.
     */
    public double getRadio() {
        return radio;
    }

    /**
     * Método que setea el radio del círculo.
     *
     * @param radio Parámetro de tipo double que especifica el radio del círculo.
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
