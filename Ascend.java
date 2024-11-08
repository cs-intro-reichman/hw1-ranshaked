// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) 
	{
		int lim =  Integer.parseInt(args[0]);
		int n1 = (int)(Math.random()*lim);
		int n2 = (int)(Math.random()*lim);
		int n3 = (int)(Math.random()*lim);
		System.out.println(n1 + " " + n2 +" " +n3);
		int min = Math.min(n1,n2);
		min = Math.min(min,n3);
		int max = Math.max(n1,n2);
		max = Math.max(max,n3);
	    int m = n1 + n2 + n3 - max -min ;
		System.out.println(min +" " + m + " " + max);




	}
}
