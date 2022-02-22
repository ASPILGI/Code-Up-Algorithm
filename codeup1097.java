import java.util.*;

public class Main {  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        
    //2차원 배열생성
    int[][] arr = new int[19][19];

    //입력값 배열에 넣기
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
       arr[i][j] = sc.nextInt(); 
      }
    }

    int cnt = sc.nextInt();

    //1이면 0으로 0이면 1로
    for(int n=0; n<cnt; n++){
      int x = sc.nextInt()-1;
      int y = sc.nextInt()-1;

      //[10, i]가 0이면 1로, 1이면 0으로
      for(int i=0; i<arr.length; i++){
        if(arr[x][i] == 0){
            arr[x][i] = 1;
          }else{
            arr[x][i] = 0;
          }
        }

      //[j, x]가 0이면 1로, 1이면 0으로
      for(int j=0; j<arr.length; j++){
        if(arr[j][y] == 0){
          arr[j][y] = 1;
        }else{
          arr[j][y] = 0;
        }
      }
    }
    sc.close();
    
    //답 출력
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    } 
  } 
}