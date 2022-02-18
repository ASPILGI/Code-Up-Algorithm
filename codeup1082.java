import java.util.*;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // sc.nextInt(16) -> 16진수로 입력받는것
    int a = sc.nextInt(16);

    // %d->정수, %o->8진수, %x->16진수
    for(int i=1; i<16; i++){
      System.out.printf("%X*%X=%X\n",a,i,a*i);
    }
    
  } 
}