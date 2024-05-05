package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        // final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1);
        System.out.println(constructInit2);

        // final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit = new FieldInit();

        // 상수
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
