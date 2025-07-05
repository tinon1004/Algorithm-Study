import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();

    for (int i = 0; i < T; i++) {
      int N = sc.nextInt();
      int M = sc.nextInt();

      int result = countZero(N, M);

      System.out.println(result);
    }
  }

  public static int countZero(int N, int M) {
    int sum = 0;

    for (int num = N; num <= M; num++) {
      // 현재 숫자 저장 변수
      int currNum = num;

      if (currNum == 0) {
        sum++;
      } else {
        while (currNum > 0) {
          // 마지막 자릿수부터 한자리씩 확인
          int pos = currNum % 10;
          if (pos == 0) {
            sum++;
          }
          // 다음 앞자릿수로 이동
          currNum /= 10;
        }
      }
    }
    return sum;
  }

}
