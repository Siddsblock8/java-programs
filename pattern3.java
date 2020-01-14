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
	        for(int j=n-i;j>1;j--)
	        {
	            System.out.print(" ");
	        }
	        
	        while(k<=i)
	        {
	            System.out.print("* ");
	            ++k;
	        }
	        System.out.println();
	        k=0;
	        
	    }
	    k =n;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<i;j++)
	        {
	            System.out.print(" ");
	        }
	        
	        while(k>i)
	        {
	            System.out.print("* ");
	            --k;
	        }
	        System.out.println();
	        k=n;
	        
	    }
	}
}
