import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int r = sc.nextInt();
    int n = sc.nextInt();
    long result=0;
    // Math.pow(x, y); 는 x의y승을 뜻한다
    result = (long)(a * Math.pow(r, n-1));
    
     System.out.print(result);
    
  } 
}

