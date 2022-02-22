import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int[] arr = new int[cnt];
    int min=0;

    for(int i=0; i<cnt; i++){
      arr[i] = sc.nextInt();
      min=arr[0];
    }
    for(int i=1; i<cnt; i++){
      if(arr[i]<=min)
        min=arr[i];
    }
    System.out.print(min);
  } 
}