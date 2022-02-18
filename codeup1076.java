import java.util.*;

public class Main {  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
	//Scanner 는 String문자열만 받을수 있음 
	// chartAt() 를 통해 문자열중 한글자만 char타입으로 변환
    char start = 'a';
    char c = sc.next().charAt(0);
    do{
      System.out.println(start);
      start += 1;
    }while (start<=c);
    
  } 
}