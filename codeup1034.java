import java.util.Scanner;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    sc.close();
    
	//Integer.parseInt -> 숫자형의 문자열을 첫번째 인자 값으로 받고 변환할 진수값을 입력하면 해당 진수에 맞춰 Interger 형으로 반환하여줍니다
    int octal = Integer.parseInt(s, 8);

    System.out.printf("%d", octal);

  } 
}