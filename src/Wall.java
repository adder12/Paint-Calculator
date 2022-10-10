public class Wall {
    private double length;
    private double height;
    private double area;

    private Obstruction[] obstructions;


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea() {
        this.area = this.length * this.height;
    }
    public Obstruction getSingleObstruction(int index){

        return this.obstructions[index];

    }


    public  Wall(double length, double height){
        this.length = length;
        this.height = height;
        this.area = this.height * this.length;
    }

    public Wall(){
        this.length = 0;
        this.height = 0;
        this.area = 0;
    }
    public  Wall(double length, double height, Obstruction[] obstructions){
        this.length = length;
        this.height = height;
        this.area = this.height * this.length;
        this.obstructions = obstructions;
    }
}
