import java.util.*;
public class Scanner_input {
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.print("Enter a Number: ");
	    int num=in.nextInt();
	    System.out.println("Entered num is: "+num);
	    
	    Scanner word=new Scanner(System.in);
	    System.out.print("Enter a String: ");
	    String str=word.next();
	    System.out.println("Entered String is: "+str);
	    
	    Scanner flt=new Scanner(System.in);
	    System.out.print("Enter a float: ");
	    Float f1=word.nextFloat();
	    System.out.println("Enter float is: "+f1);
	    
	    Scanner dbl=new Scanner(System.in);
	    System.out.print("Enter a double: ");
	    Double db1=word.nextDouble();
	    System.out.println("Entered double is: "+db1);
	}
}