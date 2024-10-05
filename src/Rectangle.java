public class Rectangle extends Geom implements Comparable<Geom>{

    private double width,height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public int compareTo(Geom robject) {


        if(this.area() > robject.area()){
            return 1;
        }
        else if(this.area() < robject.area()){
            return -1;
        }
        else return 0;
    }
}
