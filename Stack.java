 /*
 * @author Erick Barrera 
 * @date 01- 02 - 2023
 * Clase Stack para crear las operaciones en un arraylist
 */

 import java.util.ArrayList;

public class Stack<T> implements IStack<T> {
    protected ArrayList<T> stack = new ArrayList();


 
 /** 
  * @param item
  */
 public void push(T item){
    this.stack.add(item);
}



/** 
 * @return T
 */
public T pop(){
    return this.stack.remove(stack.size() - 1);
}


/** 
 * @return T
 */
public T peek(){
    return this.stack.get(stack.size() - 1);
}



/** 
 * @return boolean
 */
public boolean empty(){
    if (stack != null){
        return false;
    }
    return true;
}



/** 
 * @return int
 */
public int size(){
    return this.stack.size();
} 


}
