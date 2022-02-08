import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);

    // toHexString -> 10진수를 16진수로 변환
    String a = Integer.toHexString(sc.nextInt());

    System.out.print(a);

  } 
}