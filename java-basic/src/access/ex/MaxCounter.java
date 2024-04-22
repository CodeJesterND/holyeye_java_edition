package access.ex;

public class MaxCounter {
    private int max; // 최댓값
    private int count = 0; // 증가값


    public MaxCounter(int max) {
        this.max=max;
    }

    // 숫자 증가
    public void increment() {
        // 검증 로직
        if(count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        // 실행 로직
        count++;
    }

    public int getCount() {
        return count;
    }
}