import java.util.*;
class Number{
	private int a,b,c;
	private void get(){
	    Scanner in=new Scanner(System.in);
	    a=in.nextInt();
	    b=in.nextInt();
	    in.close();
	}
	public void sum(){
	    get();
	    c=a+b;
	    System.out.println("sum= "+c);
	}
}

public class GetPrivateDataMember{
    public static void main (String[] args) {
        Number num=new Number();
        num.sum();
    }
}