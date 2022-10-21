public class Floor {
    private double width;
    private double length;

    //initializing the class fields.
    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width) {
        if (width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }

    public void setLength(double length) {
        if (length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public double getArea(){
        return width * length;
    }
}
