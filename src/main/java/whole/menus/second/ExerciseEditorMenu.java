package whole.menus.second;

import whole.menus.MenuInterface;
import whole.menus.third.SortMenu;
import whole.menus.first.MainMenu;
import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseSotrageHandler;
import whole.validators.InputValidators;

public class ExerciseEditorMenu  implements MenuInterface {
    private InputValidators inputValidators = new InputValidators();
    private MenuInterface menuInterface = new MainMenu();
    ExerciseSotrageHandler exerciseSotrageHandler = new ExerciseSotrageHandler();
    SortMenu sortMenu = new SortMenu();
    @Override
    public void show() {
        System.out.println("Welcome in Exercise Editor:");
        System.out.println("Select Option and write in console");
        System.out.println();
        System.out.println("1.Show actual Exercises"); // To showExercises
        System.out.println("2.Add Exercise"); // To Exercise Creator
        System.out.println("3.Delete Exercise"); // To ShowExercises
        System.out.println("4.Back"); // To ShowExercises
        switch (inputValidators.inputLimiter(4,this)){
            case 1:{
                sortMenu.show();
                show();
                break;
            }
            case 2:{
                //
                Exercise exercise = exerciseSotrageHandler.createExercise();
                exerciseSotrageHandler.addExercise(exercise);
                show();
                break;
            }
            case 3:{
                Exercise sorted = sortMenu.showAndGive();
                exerciseSotrageHandler.removeExercise(sorted);
                show();

                break;
            }
            case 4:{
                menuInterface.show();
                break;
            }
        }
    }
}
