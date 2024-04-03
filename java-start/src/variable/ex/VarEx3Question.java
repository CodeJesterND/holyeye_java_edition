/*
    문제 3. long 타입의 변수를 선언하고, 그 변수를 10000000000(백억)으로 초기화한 후 출력하는 프로그램을 작성하세요.
           boolean 타입의 변수를 선언하고, 그 변수를 true 로 초기화 한 후 출력하는 프로그램을 작성하세요.
 */
package variable.ex;

public class VarEx3Question {
    
    public static void main(String[] args){
        long longVar = 10000000000L;
        System.out.println(longVar);

        boolean booleanVar = true;
        System.out.println(booleanVar);
    }
}