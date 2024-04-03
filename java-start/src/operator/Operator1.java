package operator;

public class Operator1 {

    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력: a + b = 7

        /*
        int sum = a + b 계산 과정
        int sum = a + b //1. 변수 값 읽기
        int sum = 5 + 2 //2. 변수 값 계산
        int sum = 7 //3. 계산 결과를 sum에 대입
        sum = 7 //최종 결과
         */

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff); // 출력: a - b = 3

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi); // 출력: a * b = 10

        // 나눗셈
        int div = a / b;
        System.out.print("a / b = " + div); // 출력: a / b = 2

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 출력: a % b = 1
    }
}