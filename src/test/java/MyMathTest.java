import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Test
    public void sumWith3Numbers(){
        assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void sumWith1Number(){
        assertEquals(3, myMath.sum(new int[]{3}));
    }

}
