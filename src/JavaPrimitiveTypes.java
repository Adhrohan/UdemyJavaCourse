public class JavaPrimitiveTypes {
    public static void main(String[] args) {

        //Integer primitive type
        int intValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value is " + myMinIntValue); //-2147483648
        System.out.println("Integer maximum value is " + myMaxIntValue); //2147483647

        //Overflows, if you try to put more than maximum value.
        //Underflow's, if you try to put more than minimum value.

        //Byte primitive type
        byte byteValue = 127;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte minimum value is: " + myMinByteValue); //-128
        System.out.println("Byte maximum value is: " + myMaxByteValue); //127

        //Short primitive type
        short ShortValue = 32767;
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short minimum value is: " + myMinShortValue); //-32768
        System.out.println("Short maximum value is: " + myMaxShortValue); //32767

        //long primitive type
        long longValue = 67563475477L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long minimum value is: " + myMinLongValue); //-9223372036854775808
        System.out.println("Long maximum value is: " + myMaxLongValue); //9223372036854775807






    }
}
