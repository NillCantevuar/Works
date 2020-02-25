import whole.menus.first.MainMenu;
import whole.validators.InputValidators;

public class Main {
    public static void main(String[] args) {
        InputValidators inputValidators = new InputValidators();

        MainMenu mainMenu = new MainMenu();
        mainMenu.show();

    }
}
