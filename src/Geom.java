public abstract class Geom implements ICompute, Comparable<Geom>{

   // public abstract double area() ;

    public int compareTo(Geom gobject) {

        if(this.area() > gobject.area()) {
            return 1;
        }
        else if(this.area() < gobject.area()){
            return -1;
        }
        else return 0;
    }
}
