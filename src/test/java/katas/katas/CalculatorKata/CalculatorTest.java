package katas.katas.CalculatorKata;

import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.Matchers;
import org.hamcrest.core.IsEqual;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;




public class CalculatorTest {
    @Test
    void calculatorStartsWithTotalEqualZero() {
        Calculator calculator = new Calculator();
        assertThat(calculator.getTotal(), equalTo(0.0) );

    }
    @Test
    void calculatorCanSum() {
        Calculator calculator = new Calculator();
        double num1 = 5.0;
        calculator.sumar(num1);
        assertThat(calculator.getTotal(), equalTo(num1) );
    }

    @Test
    void calculatorCanRest() {
        Calculator calculator = new Calculator();
        calculator.setTotal(50);
        double num1 = 10;
        calculator.rest(num1);
        assertThat(calculator.getTotal(), equalTo(40.0));
    }
    @Test
    void calculatorCanMultiply(){
        Calculator calculator = new Calculator();
        calculator.setTotal(50);
        double num1 = 10;
        calculator.multiply(num1);
        assertThat(calculator.getTotal(), equalTo(500.0));

    }

    @Test
    void calculatorCanPercentage() {
        Calculator calculator = new Calculator();
        calculator.setTotal(100);
        double percentage = 5;
        calculator.percentageOf(percentage);
        assertThat(calculator.getTotal(), equalTo(5.0));
    }

    @Test
    void calculatorCanDivide() {
        Calculator calculator = new Calculator();
        calculator.setTotal(30);
        double division = 10;
        calculator.divideOf(division);
        assertThat(calculator.getTotal(), equalTo(3.0));
    }

    @Test
    void testIfIsEvenNumber() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isEven(8));
        assertFalse(calculator.isEven(7));
    }

    @Test
    void testGetBiggerNumber() {
        Calculator calculator = new Calculator();
        double num1 = 8;
        double num2 = 2;
        assertThat(calculator.getBigger(num1, num2), equalTo(num1));

    }
    @Test
    void testCanSumAnArray(){
        Calculator calculator = new Calculator();
        int [] array = {1, 2, 3, 4};
        calculator.getArray(array);
    }

    @Test
    void testGetListWithNumbersBiggerThan5(){
        Calculator calculator = new Calculator();
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(4);
        list.add(6);
        list.add(10);
        assertThat(list.size(), equalTo(2));
    }


}
