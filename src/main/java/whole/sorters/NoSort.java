package whole.sorters;

import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseStorage;
import whole.validators.InputValidators;

import java.util.ArrayList;
import java.util.List;

public class NoSort {
    public Exercise showAndGiveAll(){
        InputValidators inputValidators = new InputValidators();
        //wyswietl cala liste
        showAll();
        //wyobt na podstqawie numerka
        select(inputValidators.inputLimiter(ExerciseStorage.exercisesList.size(),null));
        return null;
    }

    private void select(int inputLimiter) {



    }

    private void showAll(){

    }
}
