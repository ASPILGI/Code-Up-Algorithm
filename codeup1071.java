import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

	// while-if-break 문 
    while(true){
      int a = sc.nextInt();

      if(a==0){
        break;
      }
      System.out.println(a);
    }
     
  } 
}