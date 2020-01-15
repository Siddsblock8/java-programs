import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    byte[] array=getArray();
    printArray(array);  
    
  }
   static byte[] getArray()
  {
     Scanner in = new Scanner(System.in);
     byte n;
     System.out.println("Enter the no. of elements :");
      n = in.nextByte(); 
      byte[] arr = new byte[n];
      for(int i=0;i<n;i++)
      {
          System.out.println("Enter element "+ (i+1));
          arr[i]= in.nextByte();
      }
          return(arr);
    }
   static void printArray(byte[] arr)
  {
      for(int i=0;i<arr.length;i++)
      {
          System.out.print(arr[i] +" ");
      }
    }
    
}
