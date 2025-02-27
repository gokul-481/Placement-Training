import java.util.*;
class AreaCircleAbstractClass{
    public static void main (String[] args) {
        Area obj=new Area();
        obj.cal_area();
    }
}
abstract class Circle{
    protected double area;
    abstract void cal_area();
}

class Area extends Circle{
    private double r;
    public Area()
    {
        Scanner in=new Scanner(System.in);
        r=in.nextDouble();
        in.close();
    }
    void cal_area()
    {
        area=3.14*r*r;
        System.out.println("Area="+area);
    }
}