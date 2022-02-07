import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();

    // printf는 System.out.printf(String서식, 값들);
   //  %숫자f는 숫자에.을 붙여서 소숫점 자리를 제한할 수 있습니다.
    System.out.printf("%.11f", a);

    
  } 
}