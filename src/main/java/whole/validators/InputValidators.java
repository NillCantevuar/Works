package whole.validators;

import whole.menus.MenuInterface;

import java.awt.event.ActionListener;
import java.util.Scanner;

public class InputValidators {

     public int inputLimiter(int limit, MenuInterface menuInterface){
         int result =0;
         boolean check = false;
         Scanner scanner =new Scanner(System.in);
         while (!check){
            result = scanner.nextInt();
            if (result <= limit){
                check = true;
            }
            else {

                System.out.println();
                System.out.println();
                System.out.println("Zly wybor");
                System.out.println();
                menuInterface.show();
                System.out.println();
            }
         }
         return result;
     }


}
