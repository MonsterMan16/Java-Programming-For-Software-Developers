package Section3.PrimitiveTypes.ByteShortIntLong.PrimitiveTypesChallenge;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {

        byte myByteChallenge = 15;

        short myShortChallenge = 200;

        int myIntegerChallenge = 1500;

        long myLongChallenge = 50000L + (10 * (myByteChallenge + myShortChallenge + myIntegerChallenge));

        System.out.println(myLongChallenge);
    }
}
