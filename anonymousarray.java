import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    printArray(new int[]{10,20,40,87});
  }
  static void printArray(int[] arr)
  {
      for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
  }
}
