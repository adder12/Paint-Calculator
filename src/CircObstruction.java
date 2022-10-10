public class CircObstruction {
    double diameter;
    double area;

    public double getDiameter(){
        return this.diameter;

    }
    public double getArea(){
        return this.area;
    }

    public void setDiameter(double diameter){

        this.diameter = diameter;
    }
    public void setArea(double diameter){

        this.area = Math.PI*Math.pow((diameter/2),2);

    }
    public CircObstruction(double diameter){

        this.diameter = diameter;
        setArea(diameter);
    }
}
