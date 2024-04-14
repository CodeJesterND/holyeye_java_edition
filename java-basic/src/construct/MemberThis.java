package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;
    }

    // 필드에 같은 이름의 변수 이름이 있을 경우 this 생략 가능하다.
}