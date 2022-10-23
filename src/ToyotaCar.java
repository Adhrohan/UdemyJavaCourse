public class ToyotaCar extends Car{
    private int warranty;

    public ToyotaCar(int warranty) {
        super("Toyota", "4wd", 4, 4, 6, false);
        this.warranty = warranty;
    }

    public void accelerate(int rate){
        int newVelocity = getCurrentVelocity + rate;
        if(newVelocity == 0){
            stop();
        }else if(newVelocity > 0 && newVelocity <= 10){
            changeGear(1);
        }
    }
}
