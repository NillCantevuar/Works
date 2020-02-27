package whole.menus.second;

import whole.fileOperators.Saver;
import whole.menus.MainMenu;
import whole.menus.third.EditCurrentWorkuoutMenu;
import whole.menus.MenuInterface;
import whole.menus.third.SortMenu;
import whole.menus.first.FirstMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutHandler;
import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;
import whole.storage.exercise.Exercise;
import whole.validators.EmptyListCheck;
import whole.validators.InputValidators;

import java.io.IOException;
import java.util.Scanner;

public class WorkoutCreatorMenu  implements MenuInterface {
 CurrentWorkoutHandler currentWorkoutHandler = new CurrentWorkoutHandler();
    @Override
    public void show() throws IOException {
        EmptyListCheck emptyListCheck = new EmptyListCheck();
        MenuInterface menuInterface = new FirstMenu();
        InputValidators inputValidators = new InputValidators();
        System.out.println("==================================");
        System.out.println("Your courrent Workout: ");
        CurrentWorkoutHandler.showCurrentWorkout();
        System.out.println("==================================");
        System.out.println("Select Option and write in console");
        System.out.println("1. Add exercise to current workout"); // show All
        System.out.println("2. Add break to current workout");  //Break Editor
        System.out.println("3. Edit current workout"); // Curren workout as List
        System.out.println("4. Save and Clear");
        System.out.println("5. Back"); // Curren workout as List
        System.out.println("==================================");
        switch (inputValidators.inputLimiter(5,this)){
            case 1:{
                SortMenu sortMenu = new SortMenu();
                Exercise exercise = sortMenu.showAndGive();
                currentWorkoutHandler.addExerciseToWorkout(exercise);
                System.out.println("==================================");
                System.out.println("Exercise added!");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 2:{
                currentWorkoutHandler.addBreakToWorkout();
                System.out.println("==================================");
                System.out.println("Break added!");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }
            case 3:{
                if (emptyListCheck.currentWorkoutIsEmpty()){
                    System.out.println("==================================");
                    System.out.println("Current workout is empty");
                    System.out.println("==================================");
                    MainMenu.setMenuInterface(this);
                }
                else {
                    EditCurrentWorkuoutMenu editCurrentWorkuoutMenu = new EditCurrentWorkuoutMenu();
                    MainMenu.setMenuInterface(editCurrentWorkuoutMenu);
                }

                break;

            }
            case 4:{
                Scanner scanner = new Scanner(System.in);
                Saver saver = new Saver();
                System.out.println("==================================");
                System.out.println("Type file name to save");
                System.out.println("==================================");
                String fileName =  scanner.nextLine();
                System.out.println("==================================");
                fileName = fileName+".txt";
                saver.saveWorkout(fileName);
                CurrentWorkoutStorrage.currentWorkout.clear();
                System.out.println("==================================");
                System.out.println("Workout saved and cleared!");
                System.out.println("==================================");
                MainMenu.setMenuInterface(this);
                break;
            }

            case 5:{
                MainMenu.setMenuInterface(new FirstMenu());
                break;
            }
        }
    }
}
