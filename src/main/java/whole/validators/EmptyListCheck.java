package whole.validators;

import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;
import whole.storage.exercise.ExerciseStorage;

public class EmptyListCheck {
    public boolean isEmpty(){
        return ExerciseStorage.exercisesList.size() == 0;
    }
    public boolean currentWorkoutIsEmpty(){
        return CurrentWorkoutStorrage.currentWorkout.size() ==0;
    }
}
