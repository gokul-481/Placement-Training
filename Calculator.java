import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Cals calculate = new Cals();
        calculate.add();
        int diff = calculate.diff();
        System.out.println("This is diff() with no arguments with return");
        System.out.println("diff = "+ diff);
        System.out.println("This is prod() with arguments no return");
        calculate.prod(2, 3);
        int div = calculate.div();
        System.out.println("div = "+ div);
    }
}

class Cals{
    Scanner in = new Scanner(System.in);
    void add(){
        System.out.println("This is add() with no arguments and return");
        System.out.print("Enter num1: ");
        int a = in.nextInt();
        System.out.print("Enter num2: ");
        int b = in.nextInt();
        int c = a+b;
        System.out.println("Sum = "+c);
    }
    int diff(){
        Scanner in = new Scanner(System.in);
        System.out.println("This is diff() with no arguments with return");
        System.out.print("Enter num1: ");
        int a = in.nextInt();
        System.out.print("Enter num2: ");
        int b = in.nextInt();
        int c = a-b;
        return c;

    }
    void prod(int num1, int num2){
        int a = num1;
        int b = num2;
        int c = a * b;
        System.out.println("Product = "+c);
        
    }
    int div(){
        Scanner in = new Scanner(System.in);
        System.out.println("This is div() with no arguments with return");
        System.out.print("Enter num1: ");
        int a = in.nextInt();
        System.out.print("Enter num2: ");
        int b = in.nextInt();
        int c = a/b;
        return c;

    }
    
}