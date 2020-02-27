import whole.fileOperators.Loader;
import whole.menus.MainMenu;
import whole.menus.first.FirstMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;

import java.io.IOException;

public class Starter {
    public void start() throws IOException {
        Loader loader = new Loader();
        loader.readExerciseListFromFile();
        CurrentWorkoutStorrage.currentWorkout.clear();
        MainMenu mainMenu = new MainMenu();
        mainMenu.keep();
    }
}
