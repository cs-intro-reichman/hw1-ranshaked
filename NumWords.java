// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) 
	{
	   int nW = Integer.parseInt(args[0]);
	   int hundreds = (nW/100)%10;
	   int tens = (nW/10)%10;
	   int ones = nW%10;
	   System.out.println(hundreds  + " hundreds, " +tens + " tens, and " +ones + " ones.");
	 
	   
	}
}
