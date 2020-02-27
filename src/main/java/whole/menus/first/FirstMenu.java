package whole.menus.first;

import whole.fileOperators.Saver;
import whole.menus.MainMenu;
import whole.menus.second.ExerciseEditorMenu;
import whole.menus.MenuInterface;
import whole.menus.second.WorkoutCreatorMenu;
import whole.validators.EmptyListCheck;
import whole.validators.InputValidators;

import java.io.IOException;

public class FirstMenu implements MenuInterface {
    Saver saver = new Saver();
    InputValidators inputValidators = new InputValidators();
    EmptyListCheck emptyListCheck = new EmptyListCheck();
    @Override
    public void show() throws IOException {
        System.out.println("==================================");
        System.out.println("Welcome in WorkoutPlanner");
        System.out.println("Select Option and write in console:");
        System.out.println("1. ExerciseEditor"); //To Exercise Menu Editor
        System.out.println("2. WorkoutCreator"); //To Workout Creator Menu
        System.out.println("3. Exit");
        System.out.println("==================================");
        int sw = 1;
        switch (inputValidators.inputLimiter(3,this)) {//inputLimiter
            case 1:{
                MainMenu.setMenuInterface(new ExerciseEditorMenu());
                break;
            }
            case 2:{
                if (emptyListCheck.isEmpty()){
                    System.out.println("==================================");
                    System.out.println("List of exercises is empty!");
                    System.out.println("==================================");
                    MainMenu.setMenuInterface(this);
                }else {
                    WorkoutCreatorMenu workoutCreatorMenu = new WorkoutCreatorMenu();
                    MainMenu.setMenuInterface(workoutCreatorMenu);
                }
                break;
            }
            case 3:
                saver.save("exerciseList.txt");
               System.exit(1);

        }
    }
}
