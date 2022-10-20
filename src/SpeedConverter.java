public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-1));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
        printConversion(25.42);
        printConversion(75.114);

    }

    //method to calculate kilometers per hour to miles per hour.
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }else {
            return (long) Math.round(kilometersPerHour/1.609);
        }
    }

    public static void printConversion(double kilometerPerHour){
        double milesPerHour;
        if (kilometerPerHour < 0){
            System.out.println("Invalid Value.");
        }
        milesPerHour = Math.round(kilometerPerHour / 1.609);
        System.out.println(kilometerPerHour + "km/h="+ milesPerHour+"mi/h" );
    }
}
