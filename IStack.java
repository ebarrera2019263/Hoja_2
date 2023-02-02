 /*
 * @author Erick Barrera 
 * @date 01- 02 - 2023
 * Interfaz donde se declaran los metedos para el funcionamiento de la pila
 */

public interface IStack<T> {
    void push(T item);

    T pop();


    T peek();


    boolean empty();


    int size();
    
}
