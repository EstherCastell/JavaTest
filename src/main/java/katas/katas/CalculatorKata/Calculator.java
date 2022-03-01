package katas.katas.CalculatorKata;

import java.util.List;

public class Calculator {
    private double total = 0.0;

    public double getTotal() {
        return this.total;
    }

    public void sumar(double num1) {
        total += num1;
    }

     public void rest (double num1) {
        total -= num1;
    }

    public void multiply(double num1) {
        total *= num1;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void percentageOf(double percentage) {
        total = total * percentage / 100;
    }


    public void divideOf(double division) {
        total = total / division;
    }

    public boolean isEven(int num1) {
        if (num1 % 2 == 0)
            return true;
            return false;

    }

    public double getBigger(double num1, double num2) {
        if (num1 > num2)
            return num1;
            return num2;
    }


    public void getArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
    }

    //public List getBiggerThan5(List<Integer> list) {
      //  for (int number = 0; number < list.size(); number++) {
        //     if (number < 5)
          //       return list;
        //}

}