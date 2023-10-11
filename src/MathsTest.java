import org.junit.*;
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
public class MathsTest {
    Maths maths;
//    private maths Maths;

    @Before
    public void setUPInstance(){
        maths = new Maths();
    }
        @Test
        public void setUpAddition() {
            int result = maths.addTwoNumber(2, 3);  // Call the method from the Maths class
//            assertEquals(5, result);  // Check if the result is equal to 5
        }
        @Test
        public void checkTheSumOfTwoNumberEqualsThree(){
        Assert.assertEquals(3,maths.addTwoNumber(5,4));
        }


    }

