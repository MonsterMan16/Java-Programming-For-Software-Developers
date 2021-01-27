package Section4.Challenges.DecimalComparatorChallenge;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        return ((int)((number1 * 10) * 100) == (int)((number2 * 10)* 100));
    }
}
