package whole.storage.exercise;

import whole.storage.currentWorkoutStorage.WorkoutPice;

public class Exercise implements WorkoutPice {

   private String muscleCategory;
   private String muscleSubCategory;
   private String exerciseName;
   private String exerciseSubName;
   private int repetitions;

    public int getRepetitions() {
        return repetitions;
    }

    public void setRepetitions(int repetitions) {
        this.repetitions = repetitions;
    }

    public Exercise(String muscleCategory, String muscleSubCategory, String exerciseName, String exerciseSubName) {
        this.muscleCategory = muscleCategory;
        this.muscleSubCategory = muscleSubCategory;
        this.exerciseName = exerciseName;
        this.exerciseSubName = exerciseSubName;
    }

    public String getMuscleCategory() {
        return muscleCategory;
    }

    public void setMuscleCategory(String muscleCategory) {
        this.muscleCategory = muscleCategory;
    }

    public String getMuscleSubCategory() {
        return muscleSubCategory;
    }

    public void setMuscleSubCategory(String muscleSubCategory) {
        this.muscleSubCategory = muscleSubCategory;
    }

    public String getExerciseName() {
        return exerciseName;
    }

    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    public String getExerciseSubName() {
        return exerciseSubName;
    }

    public void setExerciseSubName(String exerciseSubName) {
        this.exerciseSubName = exerciseSubName;
    }


    public String toStringShort() {
        return exerciseName+" "+exerciseSubName +"  "+ muscleCategory +" "+ muscleSubCategory;
    }
    public String toString(){
       return toStringShort()+" Reps: "+ repetitions;
    }
}
