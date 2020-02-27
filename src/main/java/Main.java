import whole.menus.first.MainMenu;
import whole.validators.InputValidators;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        InputValidators inputValidators = new InputValidators();

        Starter starter = new Starter();
        starter.start();

    }
}
