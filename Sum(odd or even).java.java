public class Main
{
	public static void main(String[] args) {
	int x= 123456;
	int odd=0;
	int even=0;
	while(x>0){
	    int digit=x%10;
	    x=x/10;
	    if(digit%2==0){
	        even +=digit;
	    }
	    else{
	        odd +=digit;
	    }
	}
	System.out.println("Addition of odd number");
	System.out.println(odd);
	System.out.println("Addition of even number");
	System.out.println(even);
} 
}
