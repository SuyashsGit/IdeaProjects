package codeKataExercisesTest;

import com.sparta.codeKataExercises.DaysAndWeeksCalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DaysAndWeeksCalcTest {
    @Test

    public void testWeekCalc() {
        DaysAndWeeksCalc dwc = new DaysAndWeeksCalc();

        int actual = dwc.weekCalc(50);
        int expected = 7;
        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void testDaysCalc() {
        DaysAndWeeksCalc dwc = new DaysAndWeeksCalc();

        int actual = dwc.daysCalc(55);
        int expected = 6;
        Assertions.assertEquals(expected, actual);

    }
}
