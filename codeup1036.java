import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    
	// String을 char로 변경후 int에 넣기
    int a = s.charAt(0);

    System.out.printf("%d", a);

  } 
}