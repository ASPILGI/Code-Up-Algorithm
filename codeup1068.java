import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();

    if(90<=a && a<=100){
      System.out.println("A");
    }else if(70<=a && a<=89){
      System.out.println("B");
    }else if(40<=a && a<=69){
      System.out.println("C");
    }else{
      System.out.println("D");
    }
      
  } 
}