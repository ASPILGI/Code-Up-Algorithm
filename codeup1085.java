import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // float은 4byte double은 8byte
    // 실수를 표현하기 위하여 사용하는 자료형
    double h = sc.nextInt();
    double b = sc.nextInt();
    double c = sc.nextInt();
    double s = sc.nextInt();

    double result = (h*b*c*s) / 8 / 1024 / 1024;
    System.out.printf("%.1f MB",result);
  } 
}

