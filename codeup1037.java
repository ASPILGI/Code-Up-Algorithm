import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();
	
	// int를 char로 변경하여 출력하는 3가지 방법 https://www.delftstack.com/ko/howto/java/how-to-convert-int-to-char-in-java/
	// "%s" - 문자열 서식자,  (char) 문자열로 변환! 
    System.out.printf("%s", (char)a);

  } 
}