import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        // 1. 피보나치 수열 개수 입력 (개수를 입력받기위해 메서드 사용)
        // 2. 피보나치 점화식을 통한 연산
        // 3. 피보나치 수열 출력 및 프로그램 종료 (반복문 활용)


        // (1)메서드를 사용하지 않고 구현

        int num;
        Scanner scanner = new Scanner(System.in);

        // 1
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");
        num = Integer.parseInt(scanner.nextLine());

        // 2
        int[] fibo = new int[num];
        fibo[0] = 1;
        fibo[1] = 1;

        // 3
        System.out.println("[피보나치 수열 출력]");
        for (int i = 0;i < num;i++){
            if(i == 0) {
                System.out.println(fibo[0]);
                continue;
            }else if(i == 1){
                System.out.println(fibo[1]);
                continue;
            }
            fibo[i] = fibo[i-1] + fibo[i-2];
            System.out.println(fibo[i]);

        }
        System.out.println("[안내]프로그램을 종료합니다.");



    }
}