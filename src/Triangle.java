public class Triangle extends Geom implements Comparable<Geom>{

    private double base, height, side1,side2;

    public double area(){
        return base * height * 1/2;
    }

    public double perimeter(){
        return side1 + side2 + base;
    }

    public int compareTo(Geom tobject){
        if(this.area() >  tobject.area()){
            return 1;
        }
        else if(this.area() < tobject.area()){
            return -1;
        }
        else return 0;
    }
}
