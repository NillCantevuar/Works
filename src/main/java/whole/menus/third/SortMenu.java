package whole.menus.third;

import whole.menus.MenuInterface;
import whole.sorters.SortByExerciseName;
import whole.sorters.SortByMusculePart;
import whole.storage.exercise.Exercise;
import whole.validators.InputValidators;

import java.util.List;

public class SortMenu  implements MenuInterface {

    @Override
    public void show() {
        InputValidators inputValidators = new InputValidators();
        System.out.println("Select Option and write in console");
        System.out.println();
        System.out.println("1.Sort by name"); //showList
        System.out.println("2.Sort by muscle part"); //showList

        switch (inputValidators.inputLimiter(2,this)){
            case 1:{
                SortByExerciseName sortByExerciseName = new SortByExerciseName();
                sortByExerciseName.sort();
                break;
            }
            case 2:{
                SortByMusculePart sortByMusculePart = new SortByMusculePart();
                sortByMusculePart.sort();
                break;
            }

        }
    }

    public Exercise showAndGive() {

        InputValidators inputValidators = new InputValidators();
        System.out.println("Select Option and write in console");
        System.out.println();
        System.out.println("1.Sort by name"); //showListAndGive
        System.out.println("2.Sort by muscle part"); //showListAndGive

        switch (inputValidators.inputLimiter(2,this)){
            case 1:{
                SortByExerciseName sortByExerciseName = new SortByExerciseName();
                return  sortByExerciseName.sort();

            }
            case 2:{
                SortByMusculePart sortByMusculePart = new SortByMusculePart();
                return sortByMusculePart.sort();
            }

        }
        return null;

    }
}
