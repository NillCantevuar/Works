package whole.menus.second;

import whole.fileOperators.Saver;
import whole.menus.third.EditCurrentWorkuoutMenu;
import whole.menus.MenuInterface;
import whole.menus.third.SortMenu;
import whole.menus.first.MainMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutHandler;
import whole.storage.exercise.Exercise;
import whole.validators.InputValidators;

public class WorkoutCreatorMenu  implements MenuInterface {
 CurrentWorkoutHandler currentWorkoutHandler = new CurrentWorkoutHandler();
    @Override
    public void show() {
        MenuInterface menuInterface = new MainMenu();
        InputValidators inputValidators = new InputValidators();
        System.out.println("Your courrent Workout: ");
        CurrentWorkoutHandler.showCurrentWorkout();
        System.out.println("Select Option and write in console");
        System.out.println();
        System.out.println("1. Add exercise to current workout"); // show All
        System.out.println("2. Add break to current workout");  //Break Editor
        System.out.println("3. Edit current workout"); // Curren workout as List
        System.out.println("4. Save");
        System.out.println("5. Back"); // Curren workout as List
        switch (inputValidators.inputLimiter(5,this)){
            case 1:{
                SortMenu sortMenu = new SortMenu();
                Exercise exercise = sortMenu.showAndGive();
                currentWorkoutHandler.addExerciseToWorkout(exercise);
                show();
                break;
            }
            case 2:{
                currentWorkoutHandler.addBreakToWorkout();
                show();
                break;
            }
            case 3:{
                EditCurrentWorkuoutMenu editCurrentWorkuoutMenu = new EditCurrentWorkuoutMenu();
                editCurrentWorkuoutMenu.show();
                show();
                break;

            }
            case 4:{
                Saver saver = new Saver();
                saver.saveWorkout();
                show();
                break;
            }

            case 5:{
                menuInterface.show();
                break;
            }
        }
    }
}
