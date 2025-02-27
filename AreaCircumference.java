import java.util.*;
abstract class AreaCircumference{
    static Scanner in=new Scanner(System.in);
    static int r=in.nextInt();
    static void cal_area(){
        double area=3.14*r*r;
        System.out.println("Area="+area);
    }
    static void cal_circum(){
        double circum=2*3.14*r;
        System.out.println("Circumference="+circum);
    }
    public static void main (String[] args) {
        cal_area();
        cal_circum();
    }
}