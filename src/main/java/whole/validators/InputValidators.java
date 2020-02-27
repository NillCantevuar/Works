package whole.validators;

import whole.menus.MenuInterface;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidators {

     public int inputLimiter(int limit, MenuInterface menuInterface) throws IOException {
         int result =0;
         boolean check = false;

         while (!check){
             try {
                 Scanner scanner =new Scanner(System.in);
                 System.out.println("==================================");
                 result = scanner.nextInt();
                 System.out.println("==================================");
                 if (result <= limit) {
                     check = true;
                 } else {

                     System.out.println();
                     System.out.println();
                     System.out.println("==================================");
                     System.out.println("Zly wybor");
                     System.out.println("==================================");
                     System.out.println();
                     menuInterface.show();
                     System.out.println();
                 }
             }catch (InputMismatchException | IOException ime){
                 System.out.println("==================================");
                 System.out.println("Input error. Try again");
                 System.out.println("==================================");
                 menuInterface.show();

             }
         }
         return result;
     }


}
