import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    // 반복문 안에서 continue;가 실행되면 그 아래의 내용을 건너뛰고, 다음 반복을 수행한다.
    for(int i=1; i<=a; i++){
      if(i%3==0)
        continue;
      System.out.printf("%d ",i);
    }
  } 
}

