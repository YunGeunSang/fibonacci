import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        // 1. 피보나치 수열 개수 입력 (개수를 입력받기위해 메서드 사용)
        // 2. 피보나치 점화식을 통한 연산
        // 3. 피보나치 수열 출력 및 프로그램 종료 (반복문 활용)

        // (1) 메서드 없이 구현
        // (2) 사용자의 입력을 getUserInput() 메서드로 입력받아 구현
        // (3) 피보나치 수열 연산을 getFibonacci() 메서드로 구현
        // (4) 배열 출력을 printNumbers() 메서드로 구현

        int num;

        // 1
        System.out.println("[안내]피보나치 수열 프로그램 시작.");
        num = getUserInput();

        // 2
        int[] fibo = new int[num];
        getFibonacci(fibo);

        // 3
        printNumbers(fibo);
    }

    public static int getUserInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("원하는 수열의 개수를 입력해 주세요 : ");

        return Integer.parseInt(scanner.nextLine());
    }

    public static void getFibonacci(int[] fibo){
        final int firstIndex = 0;
        final int secondIndex = 1;

        for(int i = 0;i < fibo.length;i++){
            if (i == firstIndex) {
                fibo[i] = 1;
                continue;
            }else if (i == secondIndex) {
                fibo[i] = 1;
                continue;
            }

            fibo[i] = fibo[i-1] + fibo[i-2];
        }

    }

    public static void printNumbers(int[] fibo){
        System.out.println("[피보나치 수열 출력]");
        for (int i =0;i<fibo.length;i++){
            System.out.println(fibo[i]);
        }
        System.out.println("[안내]프로그램을 종료합니다.");
    }
}