package clases;

/**
 * Clase Figura.java
 *
 * Clase abstracta que define un una figura.
 *
 * @autor Miguel Proba Estévez
 * @version 1.0
 * @since 2021-02-09
 * @see <a href = "http://www.miguelproba.com" /> Web - Miguel Proba </a>
 *
 */
public abstract class Figura {

    // Atributo

    /**
     * Area de la figura.
     */
	double area;

	// Método público

    /**
     * Metodo abstracto que define el cálculo del area.
     *
     * @return Double con el resultado del cálculo del área.
     */
    abstract public double CalcularArea();
    
}
