import java.util.Scanner;

public class Main {  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    sc.close();

    // 비교-관계연산자는 >,<,>=,<=,==(같다),!=(다르다) 6개가 있다 
    if(a==b){
      System.out.println(1);
    }else{
      System.out.println(0);
      }  
  } 
}