import java.util.*;


public class Main {  
  public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[23];
    for(int i=0; i<n; i++){
      arr[sc.nextInt()-1]++;
    }
   for(int i=0; i<arr.length; i++){
     System.out.print(arr[i]+" ");
   }
  } 
}