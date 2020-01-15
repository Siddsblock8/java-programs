import java.util.Scanner;
public class Main
{
  
  public static void main (String[]args)
  {
    Scanner in = new Scanner(System.in);
    byte m,n;
    System.out.println("Enter the no. of rows :");
      m = in.nextByte(); 
      System.out.println("Enter the no. of columns :");
      n = in.nextByte(); 
     
    byte[][] array=getArray(m,n);
    printArray(array,m,n);  
    
  }
   static byte[][] getArray(byte m,byte n)
  {
     Scanner in = new Scanner(System.in);
     
     
      byte[][] arr = new byte[m][n];
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
          System.out.println("Enter element ["+i+"]["+j+"]" ) ;
          arr[i][j]= in.nextByte();
          }
              
        }
          return(arr);
    }
   static void printArray(byte[][] arr,byte m,byte n)
  {
      for(int i=0;i<m;i++)
      {
          for(int j=0;j<n;j++)
          {
          System.out.print(arr[i][j] +" ");
      
          }
          System.out.println();
        }
    }
    
}
