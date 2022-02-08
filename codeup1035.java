import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    
    int hex = Integer.parseInt(s, 16);

	// %d -> 10진수, %o -> 8진수, %x ->16진수
    System.out.printf("%o", hex);

  } 
}