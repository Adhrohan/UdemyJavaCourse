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
        short shortValue = 32767;
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

        long longVariable = 50000L + (10L * (byteValue + shortValue + intValue));
        System.out.println(longVariable);

        //float (single precision) primitive type.

        float myMinFloatValue = Float.MIN_VALUE;//1.4E-45
        float myMaxFloatValue = Float.MAX_VALUE;//3.4028235E38

        System.out.println("Float minimum value is: " + myMinFloatValue);
        System.out.println("Float maximum value is: " + myMaxFloatValue);

        //Double (double precision) primitive type

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value is: " + myMinDoubleValue); //4.9E-324
        System.out.println("Double maximum value is: " + myMaxDoubleValue); //1.7976931348623157E308

        //Char primitive types
        //single character value
        // 16 bits memory

        char myChar = 'c';

        System.out.println(myChar);

        //Boolean primitive type

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
    }
}
