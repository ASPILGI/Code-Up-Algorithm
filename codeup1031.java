import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);

    // Integer.toOctalString() -> 10진수를 8진수로 변환
    String a = Integer.toOctalString(sc.nextInt());

    System.out.print(a);

  } 
}