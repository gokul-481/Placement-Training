class Arithmetic{
    void add(int a,int b){
        System.out.println("Sum of Two Numbers: "+(a+b));
    }
    void diff(int a,int b){
        System.out.println("Diff of Two Number: "+(a-b));
    }
    void mul(int a,int b){
        System.out.println("Product of Two Number: "+(a*b));
    }
    void div(int a,int b){
        System.out.println("Division of Two NUmber: "+(a/b));
    }
    public static void main (String[] args) {
        Arithmetic obj=new Arithmetic();
        obj.add(2,4);
        obj.diff(4,2);
        obj.mul(2,4);
        obj.div(4,2);
    }
}