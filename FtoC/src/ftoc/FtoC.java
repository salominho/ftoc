package ftoc;

import java.util.Scanner;

public class FtoC {
    
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
       double c, f;
       
       System.out.println("Digite o valor em Fahrenheit: ");
       
       f = in.nextDouble();
       
       c = (5f-160)/9;
       
       System.out.println("Valor em Celcius: " + c);

       
    }
    
}
