package whole.menus.third;

import whole.menus.MainMenu;
import whole.menus.MenuInterface;
import whole.menus.second.WorkoutCreatorMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutHandler;
import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;
import whole.validators.InputValidators;

import java.io.IOException;

public class EditCurrentWorkuoutMenu implements MenuInterface {
    @Override
    public void show() throws IOException {
        WorkoutCreatorMenu workoutCreatorMenu = new WorkoutCreatorMenu();
        InputValidators inputValidators = new InputValidators();
        CurrentWorkoutHandler currentWorkoutHandler = new CurrentWorkoutHandler();
        System.out.println("==================================");
        CurrentWorkoutHandler.showCurrentWorkout();
        System.out.println("==================================");
        System.out.println("Select Option and write in console");
        System.out.println("1. Select and delete");
        System.out.println("2. Select and add Exercise after");
        System.out.println("3. Select and add break after");
        System.out.println("4. Clear workout");
        System.out.println("5. Done editing");
        System.out.println("==================================");
        switch (inputValidators.inputLimiter(5,this)){
            case 1:{
                currentWorkoutHandler.selctAndDelete();
                System.out.println("==================================");
                System.out.println("Workout pice deleted!");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 2:{
                currentWorkoutHandler.selectAndAddExerciseAfter();
                System.out.println("==================================");
                System.out.println("Exercise added!");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 3:{
                currentWorkoutHandler.selectAndAddBreakAfter();
                System.out.println("==================================");
                System.out.println("Break added!");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 4:{
                CurrentWorkoutStorrage.currentWorkout.clear();
                System.out.println("==================================");
                System.out.println("Workout cleared");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 5:{
                MainMenu.setMenuInterface(new WorkoutCreatorMenu());
                break;
            }

        }





    }
}
