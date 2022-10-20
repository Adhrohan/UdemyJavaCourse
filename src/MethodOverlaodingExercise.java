public class MethodOverlaodingExercise {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(0,0);
        calcFeetAndInchesToCentimeters(0);
    }

    public static void calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet >= 0 || (inches > 0 && inches <= 12)){
            double centimeters = feet * 12 * 2.54 + inches;
            System.out.println(centimeters);
        }else {
            System.out.println(-1);
        }
    }

    public static void calcFeetAndInchesToCentimeters(int feet){
        if (feet > 0 ){
            double centimeters = feet * 12 * 2.54;
            System.out.println(centimeters);
        }else {
            System.out.println(-1);
        }
    }
}
