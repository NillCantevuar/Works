package whole.validators;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class InputValidatorsTest {

//    @Test
//    public void shouldGiveNumberInRange(){
//        //given
//        InputValidators inputValidators = new InputValidators();
//        int[] ints = {8,5,2};
//        ByteBuffer byteBuffer = ByteBuffer.allocate(ints.length * 4);
//        IntBuffer intBuffer = byteBuffer.asIntBuffer();
//        intBuffer.put(ints);
//        byte[] array = byteBuffer.array();
//        InputStream sysInBackup = System.in;
//        ByteArrayInputStream in = new ByteArrayInputStream(array);
//        System.setIn(in);
//        int limit = 3;
//        int expected =2;
//        //when
//        int result = inputValidators.inputLimiter(limit);
//        //then
//        System.setIn(sysInBackup);
//        Assert.assertEquals(expected,result);
//
//    }


}