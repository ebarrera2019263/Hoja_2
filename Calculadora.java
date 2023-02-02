 /*
 * @author Erick Barrera 
 * @date 01- 02 - 2023
 * Clase calculadora en la cual se manejan las operaciones de la calculadora
 */
public class Calculadora implements ICalculadora {

    double resultado;

    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double sum(double a, double b) {
        this.resultado = a + b;

        return this.resultado;
    }

    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double substraction(double a, double b) {
        this.resultado = a - b;

        return this.resultado;
    }

    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double multiply(double a, double b) {
        this.resultado = a * b;

        return this.resultado;
    }

    
    /** 
     * @param a
     * @param b
     * @return double
     */
    public double divition(double a, double b) {
        this.resultado = a / b;

        return this.resultado;
    }
    
}
