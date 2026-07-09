package net.likelion.bebc25.spring.di.constrictor;

public class GasolineCar implements Car {
    @Override
    public void startEngine(){
        System.out.println("시스템 전원을 키고 가솔린 엔진에 점화하여 시동을 켭니다.");
    }
    public void drive(){
        System.out.println("가솔린을 사용하여 주행합니다.");
    }
    public void stopEngine(){
        System.out.println("가솔린 공급을 차단하여 시동을 끕니다.");
    }
}