import java.util.Scanner;

public class Main {  
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    sc.close();

    //논리연산자 || 는 주어진 2개의 논리값 중에 하나라도 참(1) 이면 1(참)로 계산하고,
그 외의 경우에는 0(거짓) 으로 계산한다.
    if(a==1 || b==1){
      System.out.println(1);
    }else{
      System.out.println(0);
      }  
  } 
}