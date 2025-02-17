import java.util.Arrays;
public class Max
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]>max){
		    max=arr[i];
		}
		}
		System.out.println("First Max");
		System.out.println(max);
		System.out.println("Second Max:");
		Arrays.sort(arr);
		System.out.println(arr[arr.length -2]);
		System.out.println("Third max");
		Arrays.sort(arr);
		System.out.println(arr[arr.length -3]);
	}
}