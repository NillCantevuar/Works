package whole.sorters;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.internal.WhiteboxImpl;
import whole.storage.exercise.Exercise;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(PowerMockRunner.class)
@PrepareForTest(SortByExerciseName.class)
public class SortByExerciseNameTest {
    @Test
    public void shouldGiveListOfSingleNames() throws Exception {
        //given
        SortByExerciseName sortByExerciseName = new SortByExerciseName();
        String muscleCategory ="plecy";
        String subMusclePart="najszerszy";
        String categoryName = "podciaganie";
        String subName = "nachwytem";
        Exercise exercise = new Exercise(muscleCategory,subMusclePart,categoryName,subName);
        String muscleCategory1 ="plecy1";
        String subMusclePart1="najszerszy1";
        String categoryName1 = "podciaganie1";
        String subName1 = "nachwytem1";
        Exercise exercise1 = new Exercise(muscleCategory1,subMusclePart1,categoryName1,subName1);
        String muscleCategory2 ="plecy2";
        String subMusclePart2="najszerszy2";
        String categoryName2 = "podciaganie1";
        String subName2 = "nachwytem2";
        Exercise exercise2 = new Exercise(muscleCategory2,subMusclePart2,categoryName2,subName2);
        List<String> expected = Arrays.asList(categoryName,categoryName1);
        List<Exercise> given =Arrays.asList(exercise,exercise1,exercise2);
        //when
        List<String> result = WhiteboxImpl.invokeMethod(sortByExerciseName,"showPosible",given);
        //then
        Assert.assertEquals(expected,result);
    }
}