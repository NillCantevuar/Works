import whole.fileOperators.Loader;
import whole.menus.first.MainMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;
import whole.storage.exercise.ExerciseStorage;

import java.io.IOException;
import java.util.ArrayList;

public class Starter {
    public void start() throws IOException {
        Loader loader = new Loader();
        loader.readExerciseListFromFile();
        CurrentWorkoutStorrage.currentWorkout.clear();
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
    }
}
