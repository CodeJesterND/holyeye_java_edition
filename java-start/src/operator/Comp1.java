package operator;

public class Comp1 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        System.out.println(a == b);  // false, a와 b는 같지 않다
        System.out.println(a != b);  // true, a와 b는 다르다
        System.out.println(a > b);   // false, a는 b보다 크지 않다
        System.out.println(a < b);   // true, a는 b보다 작다.
        System.out.println(a >= b);  // false, a는 b보다 크거나 같지 않다
        System.out.println(a <= b);  // true, a는 b보다 작거나 같다

        //결과를 boolean 변수에 담기
        boolean result = a == b; //a == b: false
        System.out.println(result); //false

        /*
        != : 불일치(not equal to)
        > : 크다(greater than)
        < : 작다(less than)
        >= : 크거나 같다(greater than or equal to)
        <= : 작거나 같다(less than or equal to)

        비교연산자를 사용하면 참(true) 또는 거짓(false)이라는 결과가 나온다. 참 거짓은 boolean형을 사용한다.

        여기서 주의할 점은 =와 ==(= x 2)이 다르다는 점이다.
        = : 대입연산자, 변수에 값을 대입한다.
        == : 동등한지 확인하는 비교연산자

        불일치 연산자는 !=를 사용한다. !는 반대라는 뜻이다.

        문자열이 같은지 비교할 때는 == 이 아니라 .equals() 메서드를 사용해야 한다.
        ==를 사용하면 성공할 때도 있지만 실패할 때도 있다.
        지금은 이 부분을 이해하기 어려우므로 지금은 단순히 문자열의 비교는 .equals() 메서드를 사용해야 한다 정도로 알고있자, 자세한 내용은 별도로 다룬다.
         */
    }
}