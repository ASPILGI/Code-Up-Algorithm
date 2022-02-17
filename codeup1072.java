import java.util.Scanner;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String n = sc.nextLine();
    String num[] = sc.nextLine().split(" ");
    for(String s:num){
      System.out.println(s);
    }
     
  } 
}