import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String a = Integer.toHexString(sc.nextInt());

	// string.toUpperCase() -> 대문자로 변환
	// string.toLowerCase() -> 소문자로 변환
    System.out.print(a.toUpperCase());

  } 
}