package whole.fileOperators;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseStorage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Loader {

    public void readExerciseListFromFile() throws IOException {
        Gson gson = new Gson();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("exerciseList.txt"));
        Type type = new TypeToken<List<Exercise>>(){}.getType();
        String json =  bufferedReader.readLine();
        ExerciseStorage.exercisesList = gson.fromJson(json,type);
    }
}
