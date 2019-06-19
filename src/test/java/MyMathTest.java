import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MyMathTest {

    private MyMath myMath = new MyMath();

    @Before
    public void before(){
        System.out.println("Before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
    }

    @Test
    public void sumWith3Numbers(){
        System.out.println("sumWith3Numbers");
        assertEquals(6, myMath.sum(new int[]{1, 2, 3}));
    }

    @Test
    public void sumWith1Number(){
        System.out.println("sumWith1Number");
        assertEquals(3, myMath.sum(new int[]{3}));
    }

}
