import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=a; i++){
      sum+=i;
      if(sum>=a)
        break;
    }
    System.out.print(sum);
  } 
}

