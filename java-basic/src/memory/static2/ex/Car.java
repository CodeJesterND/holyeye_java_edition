package memory.static2.ex;

public class Car {
    private String carName;
    private static int carCount;

    public Car(String carName) {
        this.carName = carName;
        carCount++;
    }

    void buyTheCar() {
        System.out.println("차량 구입, 이름: " + carName);
    }

    static void showTotalCars() { // 구매한 차량 수를 출력하는 static 메서드
        System.out.println("구매한 차량 수: " + carCount);
    }
}