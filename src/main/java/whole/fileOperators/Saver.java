package whole.fileOperators;

import com.google.gson.Gson;
import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;
import whole.storage.currentWorkoutStorage.WorkoutPice;
import whole.storage.exercise.ExerciseStorage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Saver {
    private String saveWorkoutToSting() {
        StringBuilder toSave = new StringBuilder();
        int counter = 1;
        for (WorkoutPice w : CurrentWorkoutStorrage.currentWorkout
        ) {
            toSave.append(counter).append(". ").append(w);
            toSave.append("\n");
            counter++;
        }
        return toSave.toString();
    }


    private String saveCurrentExerciseListToJson() {
        Gson gson = new Gson();
        String json = gson.toJson(ExerciseStorage.exercisesList);
        return json;
    }

    private void saveJsonToFile(String fileName, String json) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(json);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public void save(String fileName) throws IOException {
        saveJsonToFile(fileName, saveCurrentExerciseListToJson());
    }


    public void saveWorkout(String fileName) throws IOException {
        String savedWorkout = saveWorkoutToSting();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        bufferedWriter.write(savedWorkout);
        bufferedWriter.flush();
        bufferedWriter.close();

    }
}
