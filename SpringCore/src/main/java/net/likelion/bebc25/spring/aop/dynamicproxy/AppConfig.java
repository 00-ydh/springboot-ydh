package net.likelion.bebc25.spring.aop.dynamicproxy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.lang.reflect.Proxy;

//스프링 컨테이너에 알랴주는 앱 설정 클래스
@Configuration
public class AppConfig {
    @Bean//스프링 빈으로 등록 (메서드명인 car가 빈의 이름이 됩니다.)
    public Car car(){
        Car target =  new HybridCar();
        Car proxyCar = (Car)Proxy.newProxyInstance(
                Car.class.getClassLoader(),
                new Class[]{Car.class},
                new TimeCheckInvoactionHandler(target));


        return proxyCar;
//        return new HybridCar();
    }


    @Bean
    public Driver driver(Car car){
        return new Driver(car);
    }
}
