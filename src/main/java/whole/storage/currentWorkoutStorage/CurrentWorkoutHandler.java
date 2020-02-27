package whole.storage.currentWorkoutStorage;

import whole.menus.third.SortMenu;
import whole.storage.exercise.Exercise;
import whole.validators.InputValidators;

import java.io.IOException;
import java.util.Scanner;

public class CurrentWorkoutHandler {
    SortMenu sortMenu = new SortMenu();
    public static void showCurrentWorkout() {
        for (WorkoutPice w:CurrentWorkoutStorrage.currentWorkout
             ) {
            System.out.println(w);
            System.out.println("\\/");
        }

    }

    public void addBreakToWorkout() {
        System.out.println("Add amount of seconds");
        Scanner scanner = new Scanner(System.in);
        Break tempBreak = new Break(scanner.nextInt());
        CurrentWorkoutStorrage.currentWorkout.add(tempBreak);

    }

    public void addExerciseToWorkout(Exercise exercise) throws IOException {
        InputValidators inputValidators = new InputValidators();
        System.out.println("Give number of repetions");
        int reps =  inputValidators.inputLimiter(99,null);
        exercise.setRepetitions(reps);
        CurrentWorkoutStorrage.currentWorkout.add(exercise);
    }


    public void selctAndDelete() throws IOException {
        System.out.println("Select element to remove: ");
        show();
       WorkoutPice workoutPice = give();
       CurrentWorkoutStorrage.currentWorkout.remove(workoutPice);
    }

    private WorkoutPice give() throws IOException {
        InputValidators inputValidators = new InputValidators();
        int witch = inputValidators.inputLimiter(CurrentWorkoutStorrage.currentWorkout.size(),null);
        return CurrentWorkoutStorrage.currentWorkout.get(witch-1);
    }

    public void selectAndAddExerciseAfter() throws IOException {
        System.out.println("==================================");
        System.out.println("Select element to add after: ");
        System.out.println("==================================");
        show();
        InputValidators inputValidators = new InputValidators();
        int witch = inputValidators.inputLimiter(CurrentWorkoutStorrage.currentWorkout.size(),null);
        Exercise exercise = sortMenu.showAndGive();
        System.out.println("==================================");
        System.out.println("Give number of repetions");
        System.out.println("==================================");
        int reps =  inputValidators.inputLimiter(99,null);
        exercise.setRepetitions(reps);
        CurrentWorkoutStorrage.currentWorkout.add(witch,exercise);

        //co dodac
        //wyswietl liste dostepnych cwiczen
        // mam to
        // switch czy break czy cwiczenie


    }
    public void selectAndAddBreakAfter() throws IOException {
        System.out.println("==================================");
        System.out.println("Select element to add after: ");
        System.out.println("==================================");
        show();
        InputValidators inputValidators = new InputValidators();
        int witch = inputValidators.inputLimiter(CurrentWorkoutStorrage.currentWorkout.size(),null);
        System.out.println("==================================");
        System.out.println("Add amount of seconds");
        System.out.println("==================================");
        Scanner scanner = new Scanner(System.in);
        Break tempBreak = new Break(scanner.nextInt());
        CurrentWorkoutStorrage.currentWorkout.add(witch, tempBreak);

        //co dodac
        //wyswietl liste dostepnych cwiczen
        // mam to
        // switch czy break czy cwiczenie


    }
    private void show (){
        int counter = 1;
        System.out.println("==================================");
        for (WorkoutPice w: CurrentWorkoutStorrage.currentWorkout
             ) {
            System.out.println(counter+". "+ w);
            counter ++;
        }
        System.out.println("==================================");


    }

}
