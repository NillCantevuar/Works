package whole.menus.third;

import whole.menus.MenuInterface;
import whole.sorters.SortByExerciseName;
import whole.sorters.SortByMusculePart;
import whole.storage.exercise.Exercise;
import whole.validators.InputValidators;

import java.io.IOException;
import java.util.List;

public class SortMenu  implements MenuInterface {

    @Override
    public void show() throws IOException {
        InputValidators inputValidators = new InputValidators();
        System.out.println("==================================");
        System.out.println("Select Option and write in console");
        System.out.println("1.Sort by name"); //showList
        System.out.println("2.Sort by muscle part"); //showList
        System.out.println("==================================");

        switch (inputValidators.inputLimiter(2,this)){
            case 1:{
                SortByExerciseName sortByExerciseName = new SortByExerciseName();
                sortByExerciseName.sortAndShow();
                break;
            }
            case 2:{
                SortByMusculePart sortByMusculePart = new SortByMusculePart();
                sortByMusculePart.sortAndShow();
                break;
            }

        }
    }

    public Exercise showAndGive() throws IOException {

        InputValidators inputValidators = new InputValidators();
        System.out.println("==================================");
        System.out.println("Select Option and write in console");
        System.out.println("1.Sort by name"); //showListAndGive
        System.out.println("2.Sort by muscle part"); //showListAndGive
        System.out.println("==================================");

        switch (inputValidators.inputLimiter(2,this)){
            case 1:{
                SortByExerciseName sortByExerciseName = new SortByExerciseName();
                return  sortByExerciseName.sortAndGive();

            }
            case 2:{
                SortByMusculePart sortByMusculePart = new SortByMusculePart();
                return sortByMusculePart.sortAndGive();
            }

        }
        return null;

    }
}
