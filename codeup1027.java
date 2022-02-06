import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String[] A = s.split("\\.");
    int x = Integer.parseInt(A[0]);
    int y = Integer.parseInt(A[1]);
    int z = Integer.parseInt(A[2]);
    System.out.printf("%02d-%02d-%04d", z, y, x);
  }
}