import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    
    
    System.out.println(a+b);
    System.out.println(a-b);
    System.out.println(a*b);
    System.out.println(a/b);
    System.out.println(a%b);
    // 실수형변수 (double)->소수점 15자리 (float)->소수점 6자리까지 표현 
    System.out.printf("%.2f", (double)a/b);
  } 
}