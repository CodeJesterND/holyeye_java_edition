package operator;

public class Logical1 {

    public static void main(String[] args){
        System.out.println("&&: AND 연산");
        System.out.println(true && true); //ture
        System.out.println(true && false); //false
        System.out.println(false && false); //false

        System.out.println("||: OR 연산");
        System.out.println(true || true); //true
        System.out.println(true || false); //true
        System.out.println(false || false); //false

        System.out.println("! 연산");
        System.out.println(!true); //false
        System.out.println(!false); //true

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); //false
        System.out.println(a || b); //true
        System.out.println(!a); //false
        System.out.println(!b); //true

        /*
        && (그리고) : 두 피연산자가 모두 참이면 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
        || (또는) : 두 피연산자 중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
        ! (부정) : 피연산자의 논리적 부정을 반환. 즉, 참이면 거짓을, 거짓이면 참을 반환

        &&: 두 피연산자가 모두 참이어야 true를 반환한다. 둘중 하나라도 거짓이면 false를 반환한다.
        ||: 두 피연산자 중 하나라도 참이면 true를 반환한다. 둘다 모두 거짓이면 false를 반환한다.
        !: 피연산자의 논리적 부정을 반환한다. 참이면 거짓을, 거짓이면 참을 반환한다.

        a && b는 false를 반환한다. 왜냐하면 둘 중 하나인 b가 거짓이기 때문이다.
        a || b는 true를 반환한다. 왜냐하면 둘 중 하나인 a가 참이기 때문이다.
        !a와 !b는 각각의 논리적 부정을 반환한다.
         */
    }
}