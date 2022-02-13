import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();
    
    //비트시프트연산  a<<b -> a곱하기 2의b승
    System.out.printf("%d", a<<b); 
  } 
}