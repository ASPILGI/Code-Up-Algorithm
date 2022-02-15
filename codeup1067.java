import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();

    if(a>0){
      if(a%2==0){
    System.out.println("plus");
    System.out.println("even");
    }else{
    System.out.println("plus");
    System.out.println("odd");
    }
      }
    else{
      if(a%2==0){
    System.out.println("minus");
    System.out.println("even");
      }else{
        System.out.println("minus");
    System.out.println("odd");
      }
    }
  } 
}