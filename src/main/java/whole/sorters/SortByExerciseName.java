package whole.sorters;

import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseStorage;
import whole.validators.InputValidators;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortByExerciseName {

    public Exercise sortAndGive() throws IOException {
        // jescze nic
        //wyswietl mozliwe opcje wyoru
        List<Exercise> ex = ExerciseStorage.exercisesList;
        List<String> names = showPosible(ex);
        String choice = getInput(names);
        // przefiltuj calosc na podstawie
        List<Exercise> filteredByName = filterList(choice);
        //wyswietl liste przefiltrofana
        showFiltered(filteredByName);
        //wybierz jedno z tych po numerze
        Exercise result= directChose(filteredByName);
        return result;
    }
    public void sortAndShow() throws IOException {
        // jescze nic
        //wyswietl mozliwe opcje wyoru
        List<Exercise> ex = ExerciseStorage.exercisesList;
        List<String> names = showPosible(ex);
        String choice = getInput(names);
        // przefiltuj calosc na podstawie
        List<Exercise> filteredByName = filterList(choice);
        //wyswietl liste przefiltrofana
        showFiltered(filteredByName);
    }

    private Exercise directChose(List<Exercise> filteredByName) throws IOException {
        InputValidators inputValidators = new InputValidators();
        int choice =  inputValidators.inputLimiter(filteredByName.size(),null);
        Exercise exercise = filteredByName.get(choice-1);
        return exercise;
    }

    private void showFiltered(List<Exercise> filteredByName) {
        int counter = 1;
        System.out.println("==================================");
        for (Exercise e:filteredByName
             ) {
            System.out.println(counter+". "+e.toStringShort());
        }
        System.out.println("==================================");
    }

    private List<Exercise> filterList(String name) {
        List<Exercise> filtered = ExerciseStorage.exercisesList.stream()
                .filter(exercise -> exercise
                        .getExerciseName()
                        .equals(name))
                .collect(Collectors.toList());
        return filtered;
    }

    private List<String> showPosible(List<Exercise> exercises) {
       Set<String> names = exercises.stream()
               .map(Exercise::getExerciseName)
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
