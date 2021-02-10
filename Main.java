
import clases.Circulo;
import clases.Figura;
import clases.Rectangulo;
import clases.Triangulo;

/**
 * Clase Main
 *
 * Clase estándar para iniciar la ejecución del programa Java.
 *
 * @autor Miguel Proba Estévez
 * @version 1.0
 * @since 2021-02-09
 * @see <a href = "http://www.miguelproba.com" /> Web - Miguel Proba </a>
 *
 */
public class Main {

    /**
     * Método de entrada a toda la aplicación en java.
     *
     * @param args Argumentos pasados por la línea de comandos.
     */
    public static void main(String[] args) {

        // Instanciación de las clases
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();

        // Seteo de parámetros
        circulo.setRadio(44.55);
        rectangulo.setBase(30);
        rectangulo.setAltura(40);
        triangulo.setBase(50);
        triangulo.setAltura(60);

        // Impresión por consola del cálculo de areas.
        System.out.println("Area del circulo "+calcularArea(circulo));
        System.out.println("Area del rectangulo "+calcularArea(rectangulo));
        System.out.println("Area del Triangulo "+calcularArea(triangulo));
       }

    /**
     * Método que calcula el área de la figura pasada por parámetro.
     *
     * @param f Parámetro de tipo figura, el cual define el tipo de figura
     *          sobre el que se realizará el cálculo del area.
     * @return Double que devuelve el valor resultante del cálculo del área.
     */
    public static double calcularArea(Figura f){ // Ejemplo de uso de polimorfismo
        return f.CalcularArea();
    }
}
