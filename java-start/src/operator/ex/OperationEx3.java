/*
    문제 2. 합격 범위
    클래스 이름은 OperationEx3 라고 적어주세요.

        1) int형 변수 score를 선언하세요.
        2) score가 80점 이상이고, 100점 이하이면 true를 출력하고, 아니면 false를 출력하세요.
 */

package operator.ex;

public class OperationEx3 {

    public static void main(String[] args) {
        int score = 80;
        boolean result = 80 <= score && score <= 100;
        System.out.println(result);

        /*
        자주 사용하는 연산자
            산술 연산자: +, -, *, /, %(나머지)
            증가 및 감소 연산자: ++, --
            비교 연산자: ==, !=, >, <, >=, <=
            논리연산자: &&(AND), ||(OR), !(NOT)
            대입연산자: =, +=, -=, *=, /=, %=

        다음 연산자들도 자주 사용하는데, 뒷 부분에서 학습한다
            삼항 연산자: ? :
            instanceof 연산자: 객체 타입을 확인한다.
            그외: new, [](배열 인덱스), .(객체 멤버 접근), () (메소드 호출)

        비트 연산자는 실무에서 거의 사용할 일이 없다. 필요할 때 찾아보자.
            비트 연산자: &, |, ^, ~, <<, >>, >>>
         */
    }
}
