import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 첫 줄에 격자판의 세로(h), 가로(w)가 공백을 두고 입력
    int h = sc.nextInt();
    int w = sc.nextInt();
    int[][] arr = new int[h+1][w+1];

    // 두 번째 줄에 놓을 수 있는 막대의 개수(n)
    int n = sc.nextInt();

 // 세 번째 줄부터 각 막대의 길이(l) 방향(d) 좌표(x,y) 입력
    for(int a=0; a<n; a++){
      int l = sc.nextInt();
      int d = sc.nextInt();
      int x = sc.nextInt();
      int y = sc.nextInt();

      // 가로방향
      if(d==0){
        for(int i=0; i<l; i++){
          arr[x][y+i] = 1;
        }
      }

      //세로방향
      else if(d==1){
        for(int i=0; i<l; i++){
          arr[x+i][y] = 1;
        }
      }
    }
  sc.close();

    //출력
    for(int i=1; i<=h; i++){
      for(int j=1; j<=w; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
  } 
}