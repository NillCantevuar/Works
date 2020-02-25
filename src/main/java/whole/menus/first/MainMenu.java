package whole.menus.first;

import whole.menus.second.ExerciseEditorMenu;
import whole.menus.MenuInterface;
import whole.menus.second.WorkoutCreatorMenu;
import whole.validators.InputValidators;

public class MainMenu  implements MenuInterface {
    InputValidators inputValidators = new InputValidators();
    @Override
    public void show() {
        System.out.println("Welcome in WorkoutPlanner");
        System.out.println("Select Option and write in console");

        System.out.println("1. ExerciseEditor"); //To Exercise Menu Editor
        System.out.println("2. WorkoutCreator"); //To Workout Creator Menu
        System.out.println("3. Exit");
        int sw = 1;
        switch (inputValidators.inputLimiter(3,this)) {//inputLimiter
            case 1:{
                ExerciseEditorMenu exerciseEditorMenu = new ExerciseEditorMenu();
                exerciseEditorMenu.show();
                break;
            }
            case 2:{
                WorkoutCreatorMenu workoutCreatorMenu = new WorkoutCreatorMenu();
                workoutCreatorMenu.show();
                break;
            }
            case 3:
                return;

        }
    }
}
