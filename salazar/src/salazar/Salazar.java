
package salazar;
import java.util.Scanner;
public class Salazar {

   
       
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int greatest = 0;

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();

            if (i == 1 || num > greatest) {
                greatest = num;
            }
        }

        System.out.println("The greatest number is: " + greatest);

        input.close();
    }
}
       
    
    

