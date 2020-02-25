package whole.storage.exercise;

import whole.storage.currentWorkoutStorage.WorkoutPice;

public class Exercise implements WorkoutPice {

   private String MuscleCategory;
   private String MuscleSubCategory;

   private String ExerciseName;
   private String ExerciseSubName;

    public Exercise(String muscleCategory, String muscleSubCategory, String exerciseName, String exerciseSubName) {
        MuscleCategory = muscleCategory;
        MuscleSubCategory = muscleSubCategory;
        ExerciseName = exerciseName;
        ExerciseSubName = exerciseSubName;
    }

    public String getMuscleCategory() {
        return MuscleCategory;
    }

    public void setMuscleCategory(String muscleCategory) {
        MuscleCategory = muscleCategory;
    }

    public String getMuscleSubCategory() {
        return MuscleSubCategory;
    }

    public void setMuscleSubCategory(String muscleSubCategory) {
        MuscleSubCategory = muscleSubCategory;
    }

    public String getExerciseName() {
        return ExerciseName;
    }

    public void setExerciseName(String exerciseName) {
        ExerciseName = exerciseName;
    }

    public String getExerciseSubName() {
        return ExerciseSubName;
    }

    public void setExerciseSubName(String exerciseSubName) {
        ExerciseSubName = exerciseSubName;
    }
}
