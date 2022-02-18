import java.util.*;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int sum=0;
    int i = sc.nextInt();
    
    for(int j=0; j<=i; j++){
      if(j%2==0) sum +=j;
    }
    System.out.print(sum);
  } 
}