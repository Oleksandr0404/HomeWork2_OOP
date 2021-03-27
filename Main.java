package curs.curs;


import curs.curs.Cars.Honda;

public class Main {
    //Task 1 Circle
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(4);
        System.out.println("Area Circle= " + circle.areaCircle());
        //Task 2
        for (int i = 0; i < 5; i++) {
            new Counter();
        }
        System.out.println("Number of created objects class Counter = " + Counter.getCounterObjects());
        //Task 3
        Honda honda = new Honda();
        honda.setName("Civic");
        honda.startEngine();
        honda.run();
        honda.setSpeed(40);
        honda.printSpeed();
        honda.stopEngine();
        //task4
        Fraction fraction1 = new Fraction(12, (short) 8);
        Fraction fraction2 = new Fraction(6, (short) 9);
        Fraction fractionResult;
        System.out.println(fraction1.toString());
        System.out.println(fraction2.toString());
        fractionResult = fraction1.add(fraction2);
        System.out.println(fractionResult.toString());
        fractionResult = fraction1.div(fraction2);
        System.out.println(fractionResult.toString());
        fractionResult = fraction1.sub(fraction2);
        System.out.println(fractionResult.toString());
        fractionResult = fraction1.mul(fraction2);
        System.out.println(fractionResult.toString());
        System.out.println(fraction1.isEquals(fraction2));//expected false
        fraction1.setDenominator((short) 10);
        fraction1.setNumerator(8);
        fraction2.setDenominator((short) 10);
        fraction2.setNumerator(8);
        System.out.println(fraction1.isEquals(fraction2));//expected true
        //task 5
        Money value1 = new Money(18, (byte) 32);
        Money value2 = new Money(15, (byte) 11);
        Money resultMoney;
        System.out.println(value1.toString());
        System.out.println(value2.toString());
        resultMoney = value1.add(value2);
        System.out.println(resultMoney.toString());
        resultMoney = value1.sub(value2);
        System.out.println(resultMoney.toString());
        resultMoney = value1.div(2);
        System.out.println(resultMoney.toString());
        resultMoney = value1.mul(4);
        System.out.println(resultMoney.toString());
        System.out.println(value1.isEquals(value2));//expected false
        value1.setHryvnya(12);
        value1.setKopick((byte) 10);
        value2.setHryvnya(12);
        value2.setKopick((byte) 10);
        System.out.println(fraction1.isEquals(fraction2));//expected true
    }
}