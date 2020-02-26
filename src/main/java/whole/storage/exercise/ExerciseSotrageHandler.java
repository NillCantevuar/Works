package whole.storage.exercise;

import java.util.Scanner;

public class ExerciseSotrageHandler {
    public Exercise createExercise() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("write muscle category");
        String muscleCategory = scanner.nextLine();
        System.out.println("write muscle part");
        String musclePart = scanner.nextLine();
        System.out.println("write exercise category name: ");
        String categoryName = scanner.nextLine();
        System.out.println("write exercise subname: ");
        String subName = scanner.nextLine();
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
