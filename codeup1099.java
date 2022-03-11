import java.util.*;

public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 10x10 배열
    int[][] arr = new int[10][10];
    for(int i=0; i<10; i++){
      for(int j=0; j<10; j++){
        arr[i][j] = sc.nextInt();
      }
    }
    // (2.2)부터 시작
    int x = 1;
    int y = 1;

    while(x<10 && y<10){
      if(arr[1][1] == 2){
        arr[1][1] = 9;
        break;
      }else {
        arr[1][1] = 9;
      }

      // 조건
      if(x<10 && y+1<10 && arr[x][y+1]==0){
        arr[x][y+1]=9;
        y++;
      }else if(x<10 && y+1<10 && arr[x][y+1]==2){
        arr[x][y+1]=9;
        break;
      }else if(x+1<10 && y<10 && arr[x+1][y]==0){
        arr[x+1][y]=9;
        x++;
      }else if(x+1<10 && y<10 && arr[x+1][y]==2){
        arr[x+1][y]=9;
        break;
      }else{
        break;
      }
    }
    // 출력
    for(int n=0; n<10; n++){
      for(int m=0; m<10; m++){
        System.out.printf("%d ", arr[n][m]);
      }
      System.out.println();
    }
    
   
  } 
}