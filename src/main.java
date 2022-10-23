public class main {
    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());
//
//        BankAccount bankAccount = new BankAccount(12345,100,"yogesh","abc@gmail.com","12345");
//        bankAccount.setAccountNumber(12345678);
//        bankAccount.setCustomerName("Yogesh Adhikari");
//        bankAccount.setCustomerEmail("yogeshadhikari@gmail.com");
//        bankAccount.setBalance(123);
//        bankAccount.setPhoneNumber("1234567890");
//
//        System.out.println(bankAccount.depositFund(123));
//        System.out.println(bankAccount.withdrawFund(123));
//        System.out.println(bankAccount.getAccountNumber());
//        System.out.println(bankAccount.getCustomerName());
//
//        VipCustomer vipCustomer = new VipCustomer();
//        System.out.println(vipCustomer.getName());
//        System.out.println(vipCustomer.getCreditLimit());
//
//        VipCustomer vipCustomer1 = new VipCustomer("yogesh","gmail.com");
//        System.out.println(vipCustomer1.getEmail());
//        System.out.println(vipCustomer1.getName());
//
//        VipCustomer vipCustomer2 = new VipCustomer();
//        System.out.println(vipCustomer2.getName());
//        System.out.println(vipCustomer2.getCreditLimit());
//        System.out.println(vipCustomer2.getEmail());
//
//        Wall wall = new Wall(5,4);
//        System.out.println("area= " + wall.getArea());
//
//        wall.setHeight(-1.5);
//        System.out.println("width= " + wall.getWidth());
//        System.out.println("height= " + wall.getHeight());
//        System.out.println("area= " + wall.getArea());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator( floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());


    }
}
