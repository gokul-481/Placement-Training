class MethodOverLoading{
    static void area(){
        int a=10;
        System.out.println("Area of Circle: "+3.14*a*a);
    }
    static void area(int a){
        System.out.println("Area of Square: "+a*a);
    }
    static void area(int a,int b){
        System.out.println("Area of Rectangle: "+a*b);
    }
    public static void main (String[] args) {
      area();
      area(10);
        area(10,5);
    }
    
}