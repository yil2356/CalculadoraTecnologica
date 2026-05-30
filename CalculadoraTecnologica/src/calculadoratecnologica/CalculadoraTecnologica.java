
package calculadoratecnologica;
import java.util.Scanner;
public class CalculadoraTecnologica {

    public static void main(String[] args) {
        int num1, num2, suma, resta ;
        System.out.println("Hola, Bienvenido Alexander Pechene");
          Scanner sc = new Scanner(System.in);
          System.out.println("ingrese primer numero");
           num1 = sc.nextInt();
          System.out.println("ingrese segundo numero");
           num2 = sc.nextInt();
          
            suma = num1+num2;
           System.out.println(" la suma es: " + suma);
           
           System.out.println("------------------------");
           
             resta = num1-num2;
           System.out.println(" la resta es: " + resta);
    }
    
}
