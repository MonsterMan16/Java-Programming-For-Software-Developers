package Section3.PrimitiveTypes.ByteShortIntLong.FloatAndDoublePrimitiveTypes.FloatAndDouble;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);
        
        int myIntValue = 5 / 3;
//        float myFloatValue = (float) 5.25;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5.00 / 3.00;
//Doubles are java's default floating point data type.
//Most of Java's methods e.g the Math package uses doubles,
//converting answers back to floats takes time plus at the chip
//level most modern processors are optimised for doubles so you will
//see no significant loss in performance using the double data type
//other then increased ram usage which is in the bytes range.
//There is no significant reason to use floats considering the amount
//of ram computers have installed within these days...
        System.out.println("MyIntValue= " + myIntValue);
        System.out.println("MyFloatValue " + myFloatValue);
        System.out.println("MyDoubleValue " + myDoubleValue);
    }
}
