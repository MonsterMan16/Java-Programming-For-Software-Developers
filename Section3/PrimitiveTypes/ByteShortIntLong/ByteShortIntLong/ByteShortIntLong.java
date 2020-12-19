package Section3.PrimitiveTypes.ByteShortIntLong.ByteShortIntLong;

public class ByteShortIntLong {
    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("(Overflow) INT Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("(Underflow) INT Busted MIN Value = " + (myMinIntValue - 1));


        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Floating Point Minimum Value = " + myMinFloatValue);
        System.out.println("Floating Point Maximum Value = " + myMaxFloatValue);
        System.out.println("(Overflow) FLOAT Busted MAX Value = " + (myMaxFloatValue + 1));
        System.out.println("(Underflow) FLOAT Busted MIN Value = " + (myMinFloatValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);
        System.out.println("(Overflow) Byte Busted Max Value = " + (myMinByteValue + 1));
        System.out.println("(Underflow) Byte Busted Min Value = " + (myMaxByteValue - 1));

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);
        System.out.println("(Overflow) Short Busted Max Value = " + (myMinShortValue + 1));
        System.out.println("(Underflow) Short Busted Min Value = " + (myMaxShortValue - 1));


        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        System.out.println("(Overflow) Long Busted Max Value = " + (myMinLongValue + 1));
        System.out.println("(Underflow) Long Busted Min Value = " + (myMaxLongValue - 1));

    }
}
