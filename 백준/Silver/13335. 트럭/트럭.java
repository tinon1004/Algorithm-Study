import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 트럭 수
    int w = sc.nextInt(); // 다리 길이
    int L = sc.nextInt(); // 다리 최대 하중
    //트럭 대기열 생성 -> 아직 다리에 올라가지 않은 트럭들
    int[] trucks = new int[n]; 

    //트럭 무게 순서대로 저장
    for(int i=0; i<n; i++){
      trucks[i] = sc.nextInt();
    }

    //QUEUE로 다리 만들기
    Queue<Integer>bridge = new LinkedList<>();
    //일단 다리 위를 0으로 초기화
    for(int i=0; i<w; i++){
      bridge.offer(0);
    }
    
    int sum = 0; //현재 다리 위 트럭 무게 합
    int index = 0; // 다음에 올라갈 트럭 번호
    int time = 0; //시간

    // 다리에 못 올라간 트럭이 남아있는 동안 반복
    // 다리에 한 번이라도 올라갔는지가 기준이 됨
    while(n > index) {
      time++;
      //다리 위 트럭 이동
      //다리의 맨 앞 칸 제거 -> 무게합에서 제거
      sum -= bridge.poll();
      
      // 새 트럭을 올릴 수 있는지 확인
      
      // 다리 하중을 초과하지 않으면 트럭 진입 허용
      if (sum + trucks[index] <= L){ 
        sum += trucks[index]; // 다리 하중 증가
        bridge.offer(trucks[index]); // 다리 맨 뒤에 트럭 추가
        index++; // 다음 트럭으로 이동
      }else{
        // 새 트럭이 올라가지 못할 때 빈칸 0
        bridge.offer(0);
      }
    }
    // 마지막 트럭이 올라간 뒤 다리 길이만큼 더 이동해야 완전히 통과한 
    time += w;
    
    System.out.println(time);
  }
}