package whole.storage.currentWorkoutStorage;

import whole.storage.exercise.Exercise;
import whole.validators.InputValidators;

import java.util.Scanner;

public class CurrentWorkoutHandler {

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

    public void addExerciseToWorkout(Exercise exercise) {
        CurrentWorkoutStorrage.currentWorkout.add(exercise);
    }


    public void selctAndDelete() {
        System.out.println("Select element to remove: ");
        show();
       WorkoutPice workoutPice = give();
       CurrentWorkoutStorrage.currentWorkout.remove(workoutPice);
    }

    private WorkoutPice give() {
        InputValidators inputValidators = new InputValidators();
        int witch = inputValidators.inputLimiter(CurrentWorkoutStorrage.currentWorkout.size(),null);
        return CurrentWorkoutStorrage.currentWorkout.get(witch-1);
    }

    public void selectAndAddExerciseAfter() {
        System.out.println("Select element to add after: ");
        show();
        InputValidators inputValidators = new InputValidators();
        int witch = inputValidators.inputLimiter(CurrentWorkoutStorrage.currentWorkout.size(),null);
        CurrentWorkoutStorrage.currentWorkout.add(witch-1);

        //co dodac
        //wyswietl liste dostepnych cwiczen
        // mam to
        // switch czy break czy cwiczenie


    }
    public void selectAndAddBreakAfter() {
        System.out.println("Select element to add after: ");
        show();
        InputValidators inputValidators = new InputValidators();
        int witch = inputValidators.inputLimiter(CurrentWorkoutStorrage.currentWorkout.size(),null);

        CurrentWorkoutStorrage.currentWorkout.add(witch-1, null);

        //co dodac
        //wyswietl liste dostepnych cwiczen
        // mam to
        // switch czy break czy cwiczenie


    }
    private void show (){
        int counter = 1;
        for (WorkoutPice w: CurrentWorkoutStorrage.currentWorkout
             ) {
            System.out.println(counter+". "+ w);
            counter ++;
        }


    }

}
