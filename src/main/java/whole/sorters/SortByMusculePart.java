package whole.sorters;

import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseStorage;
import whole.validators.InputValidators;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByMusculePart  {

        public Exercise sortAndGive() throws IOException {
            //wyswietl mozliwe opcje wyoru
            List<Exercise> ex = ExerciseStorage.exercisesList;
            List<String> names = showPosible(ex);
            String choice = getInput(names);
            // przefiltuj calosc na podstawie
            List<Exercise> filteredByMuscle = filterList(choice);
            //wyswietl liste przefiltrofana
            showFiltered(filteredByMuscle);
            //wybierz jedno z tych po numerze
            Exercise result= directChose(filteredByMuscle);
            return result;
        }
        public void sortAndShow() throws IOException {
            //wyswietl mozliwe opcje wyoru
            List<Exercise> ex = ExerciseStorage.exercisesList;
            List<String> names = showPosible(ex);
            String choice = getInput(names);
            // przefiltuj calosc na podstawie
            List<Exercise> filteredByMuscle = filterList(choice);
            //wyswietl liste przefiltrofana
            showFiltered(filteredByMuscle);
        }

    private Exercise directChose(List<Exercise> filteredByMuscle) throws IOException {
        InputValidators inputValidators = new InputValidators();
        int choice =  inputValidators.inputLimiter(filteredByMuscle.size(),null);
        Exercise exercise = filteredByMuscle.get(choice-1);
        return exercise;
    }

    private void showFiltered(List<Exercise> filteredByMuscle) {
        int counter = 1;
        System.out.println("==================================");
        for (Exercise e:filteredByMuscle
        ) {
            System.out.println(counter+". "+e.toStringShort());
        }
        System.out.println("==================================");
    }

    private List<Exercise> filterList(String name) {

        List<Exercise> filtered = ExerciseStorage.exercisesList.stream()
                .filter(exercise -> exercise
                        .getMuscleCategory()
                        .equals(name))
                .collect(Collectors.toList());
        return filtered;
    }

    private List<String> showPosible(List<Exercise> exercises) {
        Set<String> names = exercises.stream()
                .map(Exercise::getMuscleCategory)
                .collect(Collectors.toSet());
        List <String> namesInList =names.stream().collect(Collectors.toList());
        int counter = 1;
        System.out.println("==================================");
        for (String s:names
        ) {
            System.out.println(counter+". "+s);
            counter++;
        }
        System.out.println("==================================");
        return namesInList;
    }
    private String getInput(List<String> names) throws IOException {
        InputValidators inputValidators = new InputValidators();
        int choice =  inputValidators.inputLimiter(names.size(),null);
        String name = names.get(choice-1);
        return name;

    }
}
