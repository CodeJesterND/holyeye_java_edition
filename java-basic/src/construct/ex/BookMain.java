package construct.ex;

public class BookMain {
    public static void main(String[] args) {
        // 기본 생성자 사용
        Book book1 = new Book();
        book1.displayinfo();

        // title과 author만을 매개변수로 받는 생성자
        Book book2 = new Book("Hello Java", "Seo");
        book2.displayinfo();

        // 모든 필드를 매개변수로 받는 생성자
        Book book3 = new Book("JPA 프로그래밍", "kim", 700);
        book3.displayinfo();
    }
}