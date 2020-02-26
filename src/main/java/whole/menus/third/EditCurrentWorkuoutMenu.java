package whole.menus.third;

import whole.menus.MenuInterface;
import whole.menus.second.WorkoutCreatorMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutHandler;
import whole.validators.InputValidators;

public class EditCurrentWorkuoutMenu implements MenuInterface {
    @Override
    public void show() {
        WorkoutCreatorMenu workoutCreatorMenu = new WorkoutCreatorMenu();
        InputValidators inputValidators = new InputValidators();
        CurrentWorkoutHandler currentWorkoutHandler = new CurrentWorkoutHandler();
        System.out.println("Select Option and write in console");
        System.out.println("");
        CurrentWorkoutHandler.showCurrentWorkout();
        System.out.println("1. Select and delete");
        System.out.println("2. Select and add after");
        System.out.println("3. Done editing");
        switch (inputValidators.inputLimiter(3,null)){
            case 1:{
                currentWorkoutHandler.selctAndDelete();
                show();
                break;
            }
            case 2:{
                currentWorkoutHandler.selectAndAddAfter();
                show();
                break;
            }
            case 3:{
                workoutCreatorMenu.show();
                break;
            }

        }





    }
}
