package access;

public class Speaker {
    private int volume; // private 사용

    // 생성자
    Speaker(int volume) {
        this.volume = volume;
    }

    // 음량 증가
    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    // 음량 감소
    void volumeDown() {
        if (volume <= 10) {
            System.out.println("음량을 증가할 수 없습니다. 최소 음량입니다.");
        }
        volume -= 10;
        System.out.println("음량을 10 감소합니다.");
    }

    // 현재 음량 표시
    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}