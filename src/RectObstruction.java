public class RectObstruction {
    private double height;
    private double length;
    private double area;


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }



    public RectObstruction(double length, double height){

        this.length = length;
        this.height = height;
        this.area = this.length * this.height;

    }
}
