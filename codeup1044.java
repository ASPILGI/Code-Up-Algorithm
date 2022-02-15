import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    sc.close();
    
    //  ++a -> 증감된 a가 출력, a++ -> a가 그대로 출력되고 다음에 증감
    System.out.println(++a); 
  } 
}