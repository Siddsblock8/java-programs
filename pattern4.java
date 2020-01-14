import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		byte n;
		byte k=0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the no. of rows: ");
	    n=in.nextByte();
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<2*n;j++)
	        {
	            if(j<5)
	            {
	            if(j<n-i)
	            System.out.print("* ");
	            else 
	            System.out.print(" ");
	            }
	            else
	            {
	            if(j>=n+i)
	            System.out.print("* ");
	            else 
	            System.out.print("   ");
	            }
	        }
	        System.out.println();
	    }
	   for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<2*n;j++)
	        {
	            if(j<5)
	            {
	            if(j<=i)
	            System.out.print("* ");
	            else 
	            System.out.print(" ");
	            }
	            else
	            {
	            if(j>=(2*n-i)-1)
	            System.out.print("* ");
	            else 
	            System.out.print("   ");
	            }
	        }
	        System.out.println();
	    }
	    
	}
}
