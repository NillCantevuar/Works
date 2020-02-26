import whole.menus.first.MainMenu;
import whole.storage.currentWorkoutStorage.CurrentWorkoutStorrage;

public class Starter {
    public void start(){
        CurrentWorkoutStorrage.currentWorkout.clear();
        MainMenu mainMenu = new MainMenu();
        mainMenu.show();
    }
}
