package memory.static2.ex;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        car1.buyTheCar();
        car2.buyTheCar();
        car3.buyTheCar();
        Car.showTotalCars(); // 구매한 차량 수를 출력하는 static 메서드
    }
}