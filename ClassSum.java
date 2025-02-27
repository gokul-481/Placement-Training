import java.util.*;
public class ClassSum
{
	public static void main(String[] args) {
		Add add=new Add();
		add.sum();
	}
}

class Add
{
    private int a,b,c;
    public void sum()
    {
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("Sum: "+c);
        in.close();
    }
}