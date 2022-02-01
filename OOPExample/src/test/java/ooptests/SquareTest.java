package ooptests;

import com.sparta.shapes.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void testCalcArea(){
        Square sq = new Square(12.0);
        double actual = sq.calcArea();
        double expected = 144.0;


        //Assertions.fail(); //to force the test to fail

        Assertions.assertEquals(expected, actual); //important method to add for the junit test.
    }
}
