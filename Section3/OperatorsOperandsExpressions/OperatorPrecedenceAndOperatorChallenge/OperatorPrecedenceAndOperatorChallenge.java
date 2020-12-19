package Section3.OperatorsOperandsExpressions.OperatorPrecedenceAndOperatorChallenge;

public class OperatorPrecedenceAndOperatorChallenge {
    public static void main(String[] args) {
        double number1 = 20.00;
        double number2 = 80.00;
        double bothNumbers = (number1 + number2) * 100.00;
        System.out.println("MyValuesTotal = " + bothNumbers);
        double remainder = bothNumbers % 40.00;
        System.out.println("theRemainder = " + remainder);

        boolean zeroCheck = (remainder == 0) ? true : false;

        System.out.println(zeroCheck);

        if(!zeroCheck) {
            System.out.println("Got some remainder");
        }
    }
}
