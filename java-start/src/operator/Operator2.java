package operator;

public class Operator2 {

    public static void main(String[] args) {

        //문자열과 문자열 더하기1
        String result1 = "hello " + "world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);

        /*
        String result3 = "a + b = " + 10 계산 과정
        "a + b = "(String) + 10(int) //문자열과 숫자 더하기
        "a + b = "(String) + "10"(int -> String) //숫자를 문자열로 변경
        "a + b = " + "10" //문자열과 문자열 더하기
        "a + b = 10" //결과
         */

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        /*
        String result4 = str + num 계산 과정
        "a + b = "(String) + num(int) //str 변수에서 값 조회
        "a + b = "(String) + 20(int) //num 변수에서 값 조회
        "a + b = "(String) + "20"(int -> String) //숫자를 문자열로 변경
        "a + b = " + "20" //문자열과 문자열 더하기
        "a + b = 20" //결과
         */
    }
}