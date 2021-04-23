import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator = new CustomCalculator();
    // 더하기 테스트
    @Test
    public void addTest(){
        int result = customCalculator.add(10,10);
        //여기
        assertTrue(result == 20);
    }
    @Test
    public void subTest(){
        int result = customCalculator.subtract(10,3);
        assertTrue(result == 7);
    }
    @Test
    public void mulTest(){
        int result = customCalculator.multiply(10,3);
        assertTrue(result == 30);
    }
    @Test
    public void divTest(){
        int result = customCalculator.divide(10,3);
        assertTrue(result == 3);
    }

}