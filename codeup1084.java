import java.io.*;
//throws IOException -> 입출력 예외처리
public class Main {  
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String[] s = br.readLine().split(" ");

    int c=0;
    // String 을 Integer 로 변경하기 위해 사용하는 메소드
    for(int i=0; i<Integer.valueOf(s[0]); i++){
      for(int j=0; j<Integer.valueOf(s[1]); j++){
        for(int k=0; k<Integer.valueOf(s[2]); k++){
          bw.write(i+" "+j+" "+k+"\n");
          c++;
          }
      }
    }
    bw.write(String.valueOf(c));
    bw.flush();
  } 
}
//BufferedReader를 사용하기 전 throws IOException{} 을 적용해주어야 한다
//InputStreamReader() 에는 System.in, OutputstreamWriter() 에는 System.out 을 넣어야 한다
//BufferedReader는 String으로 입력값을 받게 되므로 형변환을 반드시 해주어야 한다
//String[] s : String 리스트 s를 만들어 br.readLine()값을 입력한다. split()을 통해 분리 기준을 설정할 수 있다
//BufferedReader를 통해 만든 변수의 출력은 bw.write()를 사용한다. 출력에 대해서도 String으로 형 변환을 해주어야 한다
//bw.flush() 를 통해 버퍼를 초기화해야 한다 (안하면 출력이 진행되지 않았음)
