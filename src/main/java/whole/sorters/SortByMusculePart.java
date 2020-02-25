package whole.sorters;

import whole.storage.exercise.Exercise;

import java.util.List;

public class SortByMusculePart  {

        public Exercise sort() {
            // jescze nic
            //wyswietl mozliwe opcje wyoru
            showPosible();
            // przefiltuj calosc na podstawie
            List<Exercise> filteredByMuscle = filterList();
            //wyswietl liste przefiltrofana
            showFiltered(filteredByMuscle);
            //wybierz jedno z tych po numerze
            Exercise result= directChose(filteredByMuscle);
            return result;
        }

    private Exercise directChose(List<Exercise> filteredByMuscle) {
            return null;
    }

    private void showFiltered(List<Exercise> filteredByMuscle) {
    }

    private List<Exercise> filterList() {
            return null;
    }

    private void showPosible() {
    }
}
