package by.it.academia.main;

import org.junit.Assert;
import org.junit.Test;

public class IfWhileTest {
    @Test
    public void checkerSuit() {
        IfWhile ch = new IfWhile();
        int ASSERT_VALUE = 40;
        String waitedResult = "Введенное число меньше 50";
        String realResult = ch.checker(ASSERT_VALUE);

        Assert.assertEquals(waitedResult, realResult);
    }

    @Test
    public void evenGeneratorSuit() {
        IfWhile gn = new IfWhile();
        int waitedResult = 0;
        int realResult = gn.evenGenerator() % 2;

        Assert.assertEquals(waitedResult, realResult);
    }
}
