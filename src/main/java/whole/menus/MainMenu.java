package whole.menus;

import whole.menus.first.FirstMenu;

import java.io.IOException;

public class MainMenu {
   private static MenuInterface menuInterface ;

    public static void setMenuInterface(MenuInterface menuInterface) {
        MainMenu.menuInterface = menuInterface;
    }

    public void keep() throws IOException {
        menuInterface = new FirstMenu();
        while (true) {

            menuInterface.show();

        }

    }







}
