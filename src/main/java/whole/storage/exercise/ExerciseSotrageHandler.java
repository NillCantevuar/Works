package whole.storage.exercise;

import java.util.Scanner;

public class ExerciseSotrageHandler {
    public Exercise createExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("write muscle category");
        System.out.println("==================================");
        String muscleCategory = scanner.nextLine();
        System.out.println("==================================");
        System.out.println("write muscle part");
        System.out.println("==================================");
        String musclePart = scanner.nextLine();
        System.out.println("==================================");
        System.out.println("write exercise category name: ");
        System.out.println("==================================");
        String categoryName = scanner.nextLine();
        System.out.println("==================================");
        System.out.println("write exercise subname: ");
        System.out.println("==================================");
        String subName = scanner.nextLine();
        System.out.println("==================================");
        Exercise exercise = new Exercise(muscleCategory,musclePart,categoryName,subName);
       return exercise;
    }
    public void addExercise(Exercise exercise){
        ExerciseStorage.exercisesList.add(exercise);
    }

    public void removeExercise(Exercise exercise) {
        ExerciseStorage.exercisesList.remove(exercise);
    }
}
