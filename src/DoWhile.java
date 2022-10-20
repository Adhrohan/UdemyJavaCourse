public class DoWhile {
    public static void main(String[] args) {
        System.out.println(isEvenNumber(1));

    }

    public static boolean isEvenNumber(int number){
        do {

            if (number % 2 == 0){
                return true;
            }else {
                return false;
            }
        }while (true);
    }
}
