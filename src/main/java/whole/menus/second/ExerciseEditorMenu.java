package whole.menus.second;

import whole.fileOperators.Saver;
import whole.menus.MainMenu;
import whole.menus.MenuInterface;
import whole.menus.third.SortMenu;
import whole.menus.first.FirstMenu;
import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseSotrageHandler;
import whole.validators.EmptyListCheck;
import whole.validators.InputValidators;

import java.io.IOException;

public class ExerciseEditorMenu  implements MenuInterface {
    Saver saver = new Saver();
    EmptyListCheck emptyListCheck = new EmptyListCheck();
    private InputValidators inputValidators = new InputValidators();
    private MenuInterface menuInterface = new FirstMenu();
    ExerciseSotrageHandler exerciseSotrageHandler = new ExerciseSotrageHandler();
    SortMenu sortMenu = new SortMenu();
    @Override
    public void show() throws IOException {
        System.out.println("==================================");
        System.out.println("Welcome in Exercise Editor:");
        System.out.println("Select Option and write in console");
        System.out.println("1.Show actual Exercises"); // To showExercises
        System.out.println("2.Add Exercise"); // To Exercise Creator
        System.out.println("3.Delete Exercise"); // To ShowExercises
        System.out.println("4.Back"); // To ShowExercises
        System.out.println("==================================");
        switch (inputValidators.inputLimiter(4,this)){
            case 1:{
                if (emptyListCheck.isEmpty()){
                    System.out.println("==================================");
                    System.out.println("List of exercises is empty!");
                    System.out.println("==================================");
                    MainMenu.setMenuInterface(this);
                }else {
                    sortMenu.show();
                    MainMenu.setMenuInterface(this);
                }
                break;
            }
            case 2:{
                //
                Exercise exercise = exerciseSotrageHandler.createExercise();
                exerciseSotrageHandler.addExercise(exercise);
                System.out.println("==================================");
                System.out.println("Exercise added!");
                System.out.println("==================================");
                saver.save("exerciseList.txt");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 3:{
                if (emptyListCheck.isEmpty()){
                    System.out.println("List of exercises is empty!");
                    MainMenu.setMenuInterface(this);
                }else {
                    Exercise sorted = sortMenu.showAndGive();
                    exerciseSotrageHandler.removeExercise(sorted);
                    saver.save("exerciseList.txt");
                    System.out.println("==================================");
                    System.out.println("Exercise deleted!");
                    System.out.println("==================================");
                    MainMenu.setMenuInterface(this);
                }
                break;
            }
            case 4:{
                MainMenu.setMenuInterface(new FirstMenu());
                break;
            }
        }
    }
}
