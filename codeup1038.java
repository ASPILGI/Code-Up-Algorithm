import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    sc.close();

	// java.split 설명 https://codechacha.com/ko/java-substring-or-split/
	//s.split(" ");  -> 문자열 분리하기
    String[] sp = s.split(" ");

	// Long.parseLong() -> 정수형 타입 짧은거 int 긴거 long 
    System.out.printf("%d", Long.parseLong(sp[0])+Long.parseLong(sp[1]));

  } 
}