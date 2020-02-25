package whole.sorters;

import whole.storage.exercise.Exercise;

import java.util.List;

public class SortByExerciseName {

    public Exercise sort() {
        // jescze nic
        //wyswietl mozliwe opcje wyoru
         showPosible();
        // przefiltuj calosc na podstawie
        List<Exercise> filteredByName = filterList();
        //wyswietl liste przefiltrofana
        showFiltered(filteredByName);
        //wybierz jedno z tych po numerze
        Exercise result= directChose(filteredByName);
        return result;
    }

    private Exercise directChose(List<Exercise> filteredByName) {
        return null;
    }

    private void showFiltered(List<Exercise> filteredByName) {
    }

    private List<Exercise> filterList() {

        return null;
    }

    private void showPosible() {
    }


}
