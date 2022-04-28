package chapter2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void additionTest(){
        Kata calculator = new Kata();
        int results = calculator.add(6,2);
        assertEquals(8, results);

    }

    @Test
    public void subtractionTest(){
        Kata calculator = new Kata();
        int results = calculator.subtract(4,2);

    }

    @Test
    public void absoluteSubtractionTest(){
        Kata calculator = new Kata();
        int results = calculator.subtractTest(2, 4);
        assertEquals(2, results);

    }

    @Test
    public void productTest(){
        Kata calculator = new Kata();
        int results = calculator.productTest(5,5);
        assertEquals(25, results);

    }

    @Test
    public void qoutientTest(){
        Kata calculator = new Kata();
        int results = calculator.qoutientTest(5,2);
        assertEquals(2, results);

    }

    @Test
    public void qoutientTest2(){
        Kata calculator = new Kata();
        int results = calculator.qoutientTest2(10 , 0);
        assertEquals(0, results);


    }
}