package net.likelion.bebc25.spring.di.constrictor;

public class Driver {
        private final Car car;


        Driver(Car car){
            System.out.println("called constructor injection");
            this.car = car;
        }
    public void driveCar(){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
