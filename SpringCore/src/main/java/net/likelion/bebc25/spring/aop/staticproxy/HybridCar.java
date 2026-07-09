package net.likelion.bebc25.spring.aop.staticproxy;

public class HybridCar implements Car {
    public void startEngine(){
        System.out.println("시스템 전원을 키고 하이브리드 시동을 켭니다.");
    }
    public void drive(){
        System.out.println("가솔린과 전기를 사용하여 주행합니다.");
    }
    public void stopEngine(){
        System.out.println(" 시동을 끕니다.");
    }
}