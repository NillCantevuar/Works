package whole.fileOperators;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.internal.WhiteboxImpl;
import whole.storage.exercise.Exercise;
import whole.storage.exercise.ExerciseStorage;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Saver.class)
public class SaverTest {
    List<Exercise> temList = new ArrayList<>();

    @Before
    public void clear() {
        temList = ExerciseStorage.exercisesList;
        ExerciseStorage.exercisesList.clear();
    }

    @After
    public void reset() {
        ExerciseStorage.exercisesList =temList;
    }


    @Test
    public void shouldGiveSameJson() throws Exception {
            //given
        Saver saver = new Saver();
        String muscleCategory ="plecy";
        String subMusclePart="najszerszy";
        String categoryName = "podciaganie";
        String subName = "nachwytem";
        Exercise exercise = new Exercise(muscleCategory,subMusclePart,categoryName,subName);
        ExerciseStorage.exercisesList.add(exercise);
        String epected ="[{\"muscleCategory\":\"plecy\",\"muscleSubCategory\":\"najszerszy\",\"exerciseName\":\"podciaganie\",\"exerciseSubName\":\"nachwytem\"}]";
            //when
        String resutl =  WhiteboxImpl.invokeMethod(saver,"saveCurrentExerciseListToJson");
            //then
        Assert.assertEquals(epected,resutl);
    }


}