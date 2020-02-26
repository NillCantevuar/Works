package whole.storage.exercise;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Disabled;

import static org.junit.Assert.*;

public class ExerciseSotrageHandlerTest {

    @Before
    public void clear(){
        ExerciseStorage.exercisesList.clear();

    }

    @Test
    public void shouldAddExercise(){
        ExerciseSotrageHandler exerciseSotrageHandler = new ExerciseSotrageHandler();
        //given
        String muscleCategory ="plecy";
        String subMusclePart="najszerszy";
        String categoryName = "podciaganie";
        String subName = "nachwytem";
        Exercise exercise = new Exercise(muscleCategory,subMusclePart,categoryName,subName);
        //when
        exerciseSotrageHandler.addExercise(exercise);
        //then
        Assert.assertTrue(ExerciseStorage.exercisesList.contains(exercise));
    }
    @Test
    @Disabled
    public void illTest(){
        //if na silach z byte array
        ExerciseSotrageHandler exerciseSotrageHandler = new ExerciseSotrageHandler();
        Exercise exercise = exerciseSotrageHandler.createExercise();
    }

}