import java.io.*;


 /*
 * @author Erick Barrera 
 * @date 01- 02 - 2023
 * Clase  principal 
 */

public class Main {

    /** 
     * @param args
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("datos.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        IStack<Double> stack = new Stack<Double>();
        IStack<Double> stack2 = new Stack<Double>();
        
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null){
                stack2 = operar(line, stack);
                stack = stack2;
            }
            System.out.println("El resultado de las operaciones es: " + stack.peek());
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo de texto no encontrado");
            e.printStackTrace();
        }



    }

  
    
    /** 
     * @param postfixText
     * @param stack
     * @return IStack<Double>
     */
    public static IStack<Double> operar(String postfixText, IStack<Double> stack){


        ICalculadora calculadora = new Calculadora();

        for (int position = 0; position < postfixText.length(); ++position){

            char caracter = postfixText.charAt(position);

            if (Character.isLetter(caracter)){

                System.out.println("ERROR: El archivo contiene un caracter");
                break;

            }

            if (Character.isDigit(caracter)){

                stack.push((double)Character.digit(caracter, 10));

            } else if (String.valueOf(caracter).matches("[+]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.sum(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[-]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.substraction(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[*]")){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.multiply(a, b);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[/]") && stack.peek() != 0.0D){

                double a = stack.pop();
                double b = stack.pop();
                double sum = calculadora.divition(b, a);
                stack.push(sum);

            } else if (String.valueOf(caracter).matches("[/]") && stack.peek() == 0.0D){

                System.out.println("ERROR: Se intenta realizar una division dentro de cero.");
                break;
            }
        }

        return stack;
    }

}
